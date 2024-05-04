package com.Sigoli.Castro.PatoBot;

import com.bueno.spi.model.CardToPlay;
import com.bueno.spi.model.GameIntel;
import com.bueno.spi.model.TrucoCard;
import com.bueno.spi.service.BotServiceProvider;

import java.util.List;
import java.util.Optional;

public class PatoBot implements BotServiceProvider {
    @Override
    public boolean getMaoDeOnzeResponse(GameIntel intel) {
        return false;
    }

    @Override
    public boolean decideIfRaises(GameIntel intel) {
        return false;
    }

    @Override
    public CardToPlay chooseCard(GameIntel intel) {
        return null;
    }

    @Override
    public int getRaiseResponse(GameIntel intel) {
        return 0;
    }

    public Boolean checkIfOpponentIsFirstToPlay (Optional<TrucoCard> opponentCard){
        return opponentCard.isPresent();
    }
    public int getNumberOfCardsInHand (GameIntel intel){
        List<TrucoCard> cards = intel.getCards();
         return cards.size();
    }
}
