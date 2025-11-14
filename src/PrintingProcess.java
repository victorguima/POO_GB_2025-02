import java.util.ArrayList;

public class PrintingProcess extends Processo {

    private ArrayList<Processo> processos;

    public PrintingProcess(ArrayList<Processo> processos){
        super();
        this.processos = processos;
    }

    @Override
    public void execute(){
        if(processos.isEmpty()){
            System.out.println("PID " + this.getPid() + ": Nenhum processo para imprimir.");
            return;
        }
        else {
            System.out.println("PID " + this.getPid() + ": Imprimindo processos na fila:");
            for(Processo p : processos){
                System.out.println(p.toString());
            }
        }
    }

    @Override
    public String toString(){
        return "PrintingProcess PID: "+ this.getPid() + " Processos na fila: " + this.processos.size();
    }
    
}
