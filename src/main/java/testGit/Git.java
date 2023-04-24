package testGit;

public class Git {
    int version;
    String info;
    double infoCode;

    public Git(int version, String info, double infoCode) {
        this.version = version;
        this.info = info;
        this.infoCode = infoCode;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(double infoCode) {
        this.infoCode = infoCode;
    }

    public void showInfo() {
        System.out.printf("%d, %s, %f", version, info, infoCode);
    }
}
