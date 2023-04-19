package application;

public class GameCoreWrapper extends Thread {
	private GameCore gameCore;

	public GameCoreWrapper(BeatMap beatMap, NoteTiles noteTiles) {
		gameCore = new GameCore(beatMap, noteTiles);
	}

	public void run() {
		gameCore.executeGameCore();
	}

//	public GameCore getGameCore() {
//		return gameCore;
//	}
//
//	public void setGameCore(GameCore gameCore) {
//		this.gameCore = gameCore;
//	}
}
