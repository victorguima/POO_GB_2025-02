import java.io.*;
import java.util.ArrayList;

public class ReadingProcess extends Processo {

    private ArrayList<Processo> processos;

    public ReadingProcess(ArrayList<Processo> processos){
        super();
        this.processos = processos;
    }

    @Override
    public void execute(){
        String fileName = "computation.txt";
        File file = new File(fileName);

        if(!file.exists()){
            System.out.println("PID " + getPid() + ": Arquivo " + fileName + " não encontrado.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            int count = 0;

            while((linha = br.readLine()) != null){
                linha = linha.trim();
                if(!linha.isEmpty()){
                    processos.add(new ComputingProcess(linha));
                    count++;
                }
            }

            new PrintWriter(file).close();

            System.out.println("PID " + getPid() + ": Leitura concluída. " + count + " processos adicionados à fila.");

        } catch (IOException e) {
            System.out.println("PID " + getPid() + ": Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    @Override
    public String toString(){
        return "ReadingProcess PID: "+ this.getPid() + " Processos na fila: " + this.processos.size();
    }
}
