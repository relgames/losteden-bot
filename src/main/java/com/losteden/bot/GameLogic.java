package com.losteden.bot;

public class GameLogic {

    private BotState botState;

    private GameState gameState;

    private ControllQueue controllQueue;

    public BotState getBotState() {
        return botState;
    }

    public void setBotState(BotState botState) {
        this.botState = botState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public ControllQueue getControllQueue() {
        return controllQueue;
    }

    public void setControllQueue(ControllQueue controllQueue) {
        this.controllQueue = controllQueue;
    }
}
