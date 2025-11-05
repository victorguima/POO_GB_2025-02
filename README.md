# POO_GB_2025-02
Trabalho do Grau B para cadeira de Programação Orientada a Objetos - Unisinos 2025-02

UNIVERSIDADE DO VALE DO RIO DOS SINOS
ESCOLA POLITÉCNICA
Av. Unisinos, 950 Caixa Postal 275 CEP 93022-750 São Leopoldo Rio Grande do Sul Brasil
Fone: (51) 3591.1122, Ramal 1668
Trabalho Prático do Grau B
Descrição

O problema proposto é uma simulação de execução de um pool de processos. O pool consiste em numa fila de
processos que é incrementada pelo usuário e que serão executados num segundo momento, também por opção do
usuário.

Os processos são inseridos pelo usuário um-a-um na fila dos processos. Os processos também devem ser executados
na ordem em que foram cadastrados, a menos que o usuário solicite um específico pelo seu pid. Neste caso, portanto,
um processo pode ser executado antes do que o próximo a ser executado de direito.

Existem 4 tipos específicos de processos. Cada tipo implementa um algoritmo para execução. Eles são especializados
nos seguintes tipos: processo de gravação, processo de leitura, processo de impressão e processo de cálculo. Veja
abaixo o que deve ser executado no método executar de cada tipo.

Quanto aos atributos, todo processo (na sua forma mais geral) possui um pid e tem o método execute(). A superclasse
processo não deve implementar o execute() apenas deve declará-la. Cada subclasse específica de processo deve fazer
a sua implementação do método execute().

Abaixo seguem as especificações sobre o que cada método execute de cada subtipo de processo deve fazer quando
for solicitado pelo usuário:

 Processo de cálculo (ComputingProcess): executa o cálculo de uma expressão e imprime o resultado do cálculo.
Uma expressão é formada por dois operandos e uma operação (que pode ser +, -, * ou /). A expressão deve saber
como se executar. Por exemplo, se é uma soma, então o resultado do cálculo é a soma dos dois operandos.

 Processo de gravação (WritingProcess): executa a gravação de uma expressão em um arquivo de processos
(chamado computation.txt). Note que, se já existem expressões gravadas no arquivo, o processo de gravação não
deve sobrescrevê-las.

 Processo de leitura (ReadingProcess): deve ler completamente o arquivo de computações (computation.txt) e,
para cada registro lido do arquivo deve criar um objeto de processo de cálculo (ComputingProcess) e adicioná-lo
na lista de processos do sistema. Ao final da leitura, o processo deve “limpar” o arquivo. Vale lembrar que cada
linha do arquivo é uma expressão aritmética.

 Processo de impressão (PrintingProcess): tem por objetivo simplesmente imprimir na tela o pool de processos a
serem executados. Imprimindo o pid, o tipo do processo e atributos relacionados, se for o caso.

Atividades que devem ser implementadas no trabalho:

 Implementar uma fila dinâmica, que deve ser usada como a fila de processos;

 Implementar as classes relacionadas a processo.

 Implementar as seguintes opções de menu do sistema:

 Criar processo: permite ao usuário criar um processo de um dos quatro tipos específicos. Portanto, deve
solicitar ao usuário o tipo de processo a ser criado e os dados necessários para tipo de processo. Por exemplo,
para um processo do ComputingProcess, deve ser lida e montada a expressão a ser executada. Esta opção do
sistema apenas cria um objeto e o adiciona no final do array.

 Executar próximo: executa o próximo processo na ordem em que foram criados. Deve também remover o
processo executado e atualizar a lista. Portanto, executar sempre o processo do índice zero do array (o
primeiro), depois de executado removê-lo e, por fim, trazer os sucessores uma posição a frente no array de
processos.

 Executar processo específico: deve solicitar ao usuário o pid do processo a ser executado, procura o processo
pelo pid informado e, caso tenha encontrado, executa este processo mesmo que ele não seja o primeiro da
fila/array. Após a execução o processo deve ser removido e os seus sucessores devem ocupar uma posição a
frente no array.

 Salvar a fila de processos: salvar em arquivo o estado atual da fila de processos em Arquivo.

 Carregar do arquivo a fila de processos: inicializar o sistema com um array de processos do arquivo.

UNIVERSIDADE DO VALE DO RIO DOS SINOS
ESCOLA POLITÉCNICA
Av. Unisinos, 950 Caixa Postal 275 CEP 93022-750 São Leopoldo Rio Grande do Sul Brasil
Fone: (51) 3591.1122, Ramal 1668

Dicas
 Sugiro colocar um parâmetro no construtor da classe ComputingProcess para receber uma expressão como uma
string e quebrá-la em seus termos (operandos e operador).

 Sugiro passar por parâmetro no construtor das classes ReadingProcess e PrintingProcess uma referência para fila
de processos do sistema. Uma vez que eles devem interagir com a fila.

Considerações finais

➢ Será avaliada como qualidade de código a correta separação das responsabilidades de cada classe.

➢ Trabalho pode ser feito em duplas.

➢ É de responsabilidade do aluno buscar maiores esclarecimentos e ajuda no desenvolvimento do trabalho com o professor.
Normalmente, os melhores trabalhos são mostrados desde o início ao professor, que assim, pode corrigir em tempo hábil,
eventuais desvios de andamento.

➢ A entrega consiste em: arquivos de projeto e arquivo de modelagem.

➢ O prazo de entrega é 25/11.

o Enviar somente os arquivos fonte do projeto para a atividade aberta no Moodle até às 19h30min do dia 25/11/2025.
Apenas um integrante do grupo envia os arquivos. Importante: não sendo entregue até a data prevista a nota passa
a ser ZERO.

Avaliação

 Modelagem do problema (10%)

 Classe Process e subclasses (30%)

 Salvar em arquivo (20%)

 Classe Sistema (40%). Que se divide em:

 Criar processo (10%)

 Executar próximo (10%)

 Executar um processo específico (10%)

 Funcionalidades em geral (10%)
