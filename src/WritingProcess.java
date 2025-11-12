import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingProcess extends ComputingProcess {

    private String expressaoOriginal;

    public WritingProcess(String expressao){
        super(expressao);
        this.expressaoOriginal = expressao;
    }

    @Override
    public void execute(){
        String fileName = "computation.txt";

        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(this.expressaoOriginal);
            System.out.println("Expressão \"" + this.expressaoOriginal + "\" gravada com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
