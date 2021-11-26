ECOI09 - LINGUAGENS DE PROGRAMAÇÃO - T01 (2021.2 - 35T12)
Projeto #2 - 25/11/2021
Professor: Walter Aoiama Nagai

Integrantes:
Thiago Henrique Cruz de Moura - RA: 2020023875
Thaís Barros Alvim - RA: 2020008082

Utilizamos JDK 11.0.1 e testamos no 17 (adoptopenjdk-17.0.0+35)

Sistema Operacional (Testado no Windows e Linux)

Projeto foi feito inicialmente utilizando a IDE Apache NetBeans 12.5 onde foram gerados
maioria dos objetos da interface, depois continuamos a implementação no VSCode
download: https://netbeans.apache.org/download/nb125/nb125.html

****Executar o programa apartir do Restaurante.java****

Em relação aos padrões de projeto:

Padrão de projeto criacional escolhido foi o Singleton, onde utilizamos na classe
 TelaRestaurante, por meio do metodo getInstance as premissas desse padrão de
 projeto são garantidas, e utilizamos a mesma na classe Restaurante

Padrão de projeto estrutural foi o Facade, essa fachada é utilizada na classe
 Restaurante, nesta é pensado que o cliente do nosso sistema pode gerar um restaurante
 da classe TelaRestaurante que é nossa classe fachada, neste momento a unica 
 responsabilidade da classe restaurante é fornecer os produtos para a tela, e
 toda a complexidade das telas de fazer pedido, cozinha e pagamento é feita 
 internamente no TelaRestaurante.

Padrão de projeto comportamental é o Observer, o nosso EventManager está na classe
 PedidoClass e quem implementa o EventListener é a MesaClass, desta forma quando um
 pedido ficar pronto, ele podera notificar a mesa onde ele se encontra, assim
 poderemos saber se a mesa está pronta para o pagamento ou não. Toda vez que 
 incluimos um pedido em um objeto MesaClass, nos fazemos o subscribe da mesa a esse
 pedido. Toda vez que um pedido fica com status entregue ele notifica as mesas que
 estão inscritas no mesmo.

Depois foi portado para que possa ser executado no Visual Studio Code para ser enviado.
obs: no Visual Studio Code utilizamos o seguinte pack de extenções:
Extension Pack for Java: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack
