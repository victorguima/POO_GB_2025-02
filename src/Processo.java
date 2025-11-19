public abstract class Processo {

    private static int pidCounter = 0;
    private final int pid;

    public Processo(){
        this.pid = ++pidCounter;
    }

    public int getPid(){
        return this.pid;
    }

    
    public abstract void execute();

    public String write_toFile(){
        return this.getClass().getSimpleName() + ";";
    }
    
}
