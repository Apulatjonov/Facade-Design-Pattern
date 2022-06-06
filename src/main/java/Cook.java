public class Cook {
    private Spaghetti spaghetti;
    private Xinkali xinkali;
    private Vafli vafli;

    public Cook() {
        this.spaghetti = new Spaghetti();
        this.xinkali = new Xinkali();
        this.vafli = new Vafli();
    }

    public String prepareSpaghetti(){
        return spaghetti.prepare();
    }

    public String prepareXinkali(){
        return xinkali.prepare();
    }

    public String prepareVafli(){
        return vafli.prepare();
    }
}