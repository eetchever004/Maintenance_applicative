package org.example;

import java.util.List;

public class FeeCalculator {

    // créer une collection de stratégies
    private static List<FeeStrategy> strategies = List.of (
            new ChildFeeStrategy(),
            new AdultFeeStrategy()
        );

    public static double calculateFee(Visitor visitor, TicketType ticketType) {

        double fee = 0;

        // je donne la liste pour que cette recherche trouve la stratégie
        // adaptée au visitor et calcule de prix correspondant
        // algo : parcours complet de ma liste (malice) en comptant les stratégies qui conviennent
        //          1 seule stratégie doit être trouvée, sinon on lèvera une exception
        int i = 0; // indice de parcours
        int compteurStrategiesOK = 0;
        FeeStrategy strategy;
        while (i < strategies.size()) {
            strategy = strategies.get(i);
            if (strategy.accept(visitor)) {
                compteurStrategiesOK ++;
                fee = strategy.calculate(ticketType);
            }
            i ++;
        }

        // retourner fee so 1 et 1 seule stratégie
        if (compteurStrategiesOK != 1) {
            throw new IllegalArgumentException();
        }

        return fee;
    }

}
