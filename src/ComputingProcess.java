public class ComputingProcess extends Processo {

    private String[] expressao;
    private int operando_1;
    private int operando_2;
    private char operador;

    private void setExpressao(String expressao){ //Precisa adicionar validação para não causar erro se não for exatamento "1 + 1"
           
        this.expressao = expressao.split(" ");
        this.operando_1 = Integer.parseInt(this.expressao[0]);
        this.operador = this.expressao[1].trim().charAt(0);
        this.operando_2 = Integer.parseInt(this.expressao[2]);
    }

    public ComputingProcess(String expressao){
        super();
        setExpressao(expressao);
    }

    @Override
    public void execute(){
        System.out.println("Executando: " + this.operando_1 + ' ' + this.operador + ' ' + this.operando_2);
        switch (this.operador){
            case '+':
                System.out.println(this.operando_1 + this.operando_2);
                break;
            case '-':
                System.out.println(this.operando_1 - this.operando_2);
                break;
            case '*':
                System.out.println(this.operando_1 * this.operando_2);
                break;
            case '/':
                if(this.operando_2 != 0){
                    System.out.println(this.operando_1 / this.operando_2);
                } else {
                    System.out.println("Erro: Divisao por zero");
                }
                break;
            default:
                System.out.println("Erro: Operador invalido");
        }
        

    }
    
}
