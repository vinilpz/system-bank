# Sistema de contas bancárias capaz de realizar transferências, saques e depósitos.

## Criei este sistema com intuito de utilizar metodos estáticos e tratamento de exceções.

### Requisitos funcionais:

O programa deve depositar, sacar, transferir e ajustar o limite de saques dos valores.

- Um depósito <b> não </b> deve ser realizado se a entrada de valor for <b> NEGATIVA </b>;
- Um saque <b> não </b> pode ser efetuado se exceder o limite de saque imposto pelo próprio usuário;
- Um saque também <b> não </b> poderá ser realizado caso não haja saldo na conta bancária;
- Entre outras atribuições impostas por mim durante o desenvolvimento do sistema;


<b> Interface gráfica: </b>

![menu](https://user-images.githubusercontent.com/89552752/175094898-933b68db-5064-480c-b12e-9cfde6eb5516.png)

<b> Teste01 - Excedendo limite de saque: </b>

![primeiroteste](https://user-images.githubusercontent.com/89552752/175095104-b6fa4d29-2501-4a76-beab-3b496c3d3bec.png)

<b> Teste02 - Excedendo saldo da conta: </b>

![image](https://user-images.githubusercontent.com/89552752/175095296-076e90d9-046b-441f-abc2-04b6b4defd97.png)

<b> Teste03 - Entrando com valor negativo no depósito: </b>

![image](https://user-images.githubusercontent.com/89552752/175095954-f66ac7c2-824a-4bfd-a912-d680c27217ac.png)

<b> Teste04 - Realizando depósito corretamente: </b>

![image](https://user-images.githubusercontent.com/89552752/175096326-129ae081-2788-495c-aec4-87beab1a8801.png)

<b> Teste05 - Realizando saque corretamente: </b>

![image](https://user-images.githubusercontent.com/89552752/175096519-c28270bf-47ac-4c86-b072-bc63aaa79187.png)

<b> Teste06 - Realizando uma transferência e imprimindo valor taxado: </b>

![image](https://user-images.githubusercontent.com/89552752/175101088-cb0358f3-6e03-49ea-91e6-0f4fba386862.png)

<b> Teste07 - Retornando informações do banco: </b>

![image](https://user-images.githubusercontent.com/89552752/175097389-cf0ddf5b-b852-4846-9028-4853528f5600.png)

<b> Teste08 - Atualizando limite de saque: </b>

![image](https://user-images.githubusercontent.com/89552752/175097582-866d4bcd-3254-481f-a4b7-b438c711ee87.png)

<b> Teste08 - Retornar todas informações: </b>

![image](https://user-images.githubusercontent.com/89552752/175101213-9a11d3cc-ee6a-46b5-bd08-d2bfad596708.png)

<b> Teste09 - Finalizando a operação corretamente com System.exit(): </b>

![image](https://user-images.githubusercontent.com/89552752/175101363-9300c8bd-12e2-413b-8512-17b330be508a.png)

