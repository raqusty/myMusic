package music.hayasi.android.com.mymusic.module.main.entity;

public class AppInfo {
    private String name;
    private String intent;
    public AppInfo(String name, String intent) {
        this.name = name;
        this.intent = intent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }
}
