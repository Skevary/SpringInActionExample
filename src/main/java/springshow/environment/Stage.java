package springshow.environment;

/* This's Singleton class */
public class Stage {

    private Stage() {
    }

    private static class StageSingletonHolder {
	static Stage instance = new Stage();
    }

    public static Stage getInstance() {
	return StageSingletonHolder.instance;
    }

}
