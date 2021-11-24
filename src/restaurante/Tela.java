/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim - RA: 2020008082 
 */
public class Tela extends javax.swing.JFrame {
    
     ArrayList<MesaClass> mesas = new ArrayList<>();
     ArrayList<PedidoClass> PedidoEntregue = new ArrayList<>();
     
     //Numero de Pedidos
     int REQUESTS_NUM = 0;
     
     //Numero maximo de pedidos por mesa
     public static final int MAX_PEDIDOS = 3;
     
     //Numero maximo de mesas
     public static final int MAX_MESAS = 3;
     
     //Seleção
     int SelectionMesas = -1;
     
     //Status
     String STATUS_P = "Pronto", STATUS_A = "Aguardando", STATUS_E = "Entregue";
     
     // Telas
     public static final int TELA_PEDIDO1=0, TELA_PEDIDO2=1, TELA_PEDIDO3=2,
                    TELA_MESAS = 3, TELA_PEDIDOS = 4, TELA_PAGAMENTOS = 5,
                    TELA_PAGAMENTO_INT = 6;
     // Produto 1
     ProdutoClass PRODUTO1 = new ProdutoClass("Refrigerante", 5.0);
     // Produto 2
     ProdutoClass PRODUTO2 = new ProdutoClass("Hamburger", 9.0);
     // Produto 3
     ProdutoClass PRODUTO3 = new ProdutoClass("Sorvete", 2.0);
     // Produto 4
     ProdutoClass PRODUTO4 = new ProdutoClass("Salada", 6.0);
     
     /**
     * Creates new form Pedido 
     **/
    public Tela(){
       initComponents();
    }

    private void clearTelaPedidos() {
        // Limpa a seleção de produtos
        Product1.setSelected(false);
        Product2.setSelected(false);
        Product3.setSelected(false);
        Product4.setSelected(false);

        // Limpa o MesaSpinner
        MesaSpinner.setValue(0);

        // Volta para pagina inicial
        RestaurantePainel.setSelectedIndex(Tela.TELA_PEDIDO1);
    }

    private void pagePagamentoInterna(MesaClass mesa){
        pedidoPreco2.setVisible(false);  
        pedidoPreco2.setVisible(false);  
        pedidoPreco3.setVisible(false);
        pedido1.setVisible(false);  
        pedido2.setVisible(false);  
        pedido3.setVisible(false);  
        double precoPedido;
        double precoTotal = 0.0;
        String prodPedido;
        titulo.setText("Mesa " + mesa.numero);
        for (PedidoClass pedido : mesa.pedidos){
            precoPedido = 0.0;
            prodPedido = "";
            for (ProdutoClass produto : pedido.produtos){
                precoPedido += produto.preco;
                if (pedido.produtos.indexOf(produto) == (pedido.produtos.size() -1)){
                    prodPedido += produto.nome;
                }else{
                    prodPedido += produto.nome + ", ";
                }
            }
            
            precoTotal += precoPedido;
            
            
            int index = mesa.pedidos.indexOf(pedido);
            switch (index) {
                case 0:
                    pedido1.setText("Pedido 1: " + prodPedido);
                    pedido1.setVisible(true);
                    pedidoPreco1.setText("Preço: R$ " + precoPedido);
                    pedidoPreco1.setVisible(true);
                    break;
                case 1:
                    pedido2.setText("Pedido 2: " + prodPedido);
                    pedido2.setVisible(true);
                    pedidoPreco2.setText("Preço: R$ " + precoPedido);
                    pedidoPreco2.setVisible(true);
                    break;
                default:
                    pedido3.setText("Pedido 3: " + prodPedido);
                    pedido3.setVisible(true);
                    pedidoPreco3.setText("Preço: R$" + precoPedido);
                    pedidoPreco3.setVisible(true);
                    break;
            }
        }
        
        precoFull.setText("R$ " + precoTotal);
    }
    
    private void pagePagamento(){
        botaoMesa1.setVisible(false);
        botaoMesa2.setVisible(false);
        botaoMesa3.setVisible(false);
        avisoMesa.setVisible(false);
        if (mesas.isEmpty() == false){
            mesas.forEach(mesa -> {
                int index = mesas.indexOf(mesa);
                switch (index) {
                    case 0:
                        botaoMesa1.setText("Mesa " + mesa.numero);
                        botaoMesa1.setVisible(true);
                        break;
                    case 1:
                        botaoMesa2.setText("Mesa " + mesa.numero);
                        botaoMesa2.setVisible(true);
                        break;
                    default:
                        botaoMesa3.setText("Mesa " + mesa.numero);
                        botaoMesa3.setVisible(true);
                        break;
                }
            });
        }else{
            avisoMesa.setVisible(true);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RestaurantePainel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        EnterButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonFinalizarPedido = new javax.swing.JButton();
        Product1 = new javax.swing.JToggleButton();
        Product3 = new javax.swing.JToggleButton();
        Product2 = new javax.swing.JToggleButton();
        Product4 = new javax.swing.JToggleButton();
        MesaSpinner = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RestartPedido = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LMesas = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LPedidos = new javax.swing.JList<>();
        TesteTexto = new javax.swing.JLabel();
        BotaoMesas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        botaoMesa1 = new javax.swing.JButton();
        botaoMesa2 = new javax.swing.JButton();
        botaoMesa3 = new javax.swing.JButton();
        tituloTelaMesas = new javax.swing.JLabel();
        avisoMesa = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pedido1 = new javax.swing.JLabel();
        pedido2 = new javax.swing.JLabel();
        pedido3 = new javax.swing.JLabel();
        pedidoPreco2 = new javax.swing.JLabel();
        botaoPagar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        pedidoPreco3 = new javax.swing.JLabel();
        pedidoPreco1 = new javax.swing.JLabel();
        precoFull = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        TelaPedidos = new javax.swing.JMenuItem();
        GoToMesas = new javax.swing.JMenuItem();
        GoToPagMesas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RestaurantePainel.setBackground(new java.awt.Color(255, 255, 255));
        RestaurantePainel.setMaximumSize(new java.awt.Dimension(760, 560));
        RestaurantePainel.setMinimumSize(new java.awt.Dimension(760, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        EnterButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EnterButton.setText("Fazer novo pedido");
        EnterButton.setToolTipText("");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setText("Cadastro do Pedido do Cliente (no balcão)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        RestaurantePainel.addTab("Pedido_1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Mesa");

        ButtonFinalizarPedido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ButtonFinalizarPedido.setText("Finalizar");
        ButtonFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinalizarPedidoActionPerformed(evt);
            }
        });

        Product1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Product1.setText("A");

        Product3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Product3.setText("A");

        Product2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Product2.setText("A");

        Product4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Product4.setText("A");

        MesaSpinner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Product4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Product3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        RestaurantePainel.addTab("Pedido_2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Pedido finalizado com sucesso");

        RestartPedido.setActionCommand("X");
        RestartPedido.setLabel("X");
        RestartPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RestartPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(RestartPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        RestaurantePainel.addTab("Pedido_3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        LMesas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LMesas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LMesas);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText(" (Cozinha) Selecione uma mesa para acessar os pedidos feitos por ela");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        RestaurantePainel.addTab("Mesas", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        LPedidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LPedidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LPedidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(LPedidos);

        TesteTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TesteTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TesteTexto.setText("MESA");

        BotaoMesas.setBackground(new java.awt.Color(255, 204, 51));
        BotaoMesas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        BotaoMesas.setText("Voltar para Mesas");
        BotaoMesas.setBorder(null);
        BotaoMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMesasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Selecione um pedido para mudar seu status");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TesteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(BotaoMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TesteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BotaoMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        RestaurantePainel.addTab("Pedidos", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });

        botaoMesa1.setBackground(new java.awt.Color(255, 51, 51));
        botaoMesa1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        botaoMesa1.setBorder(null);
        botaoMesa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoMesa1.setLabel("Mesa 1");
        botaoMesa1.setPreferredSize(new java.awt.Dimension(520, 90));
        botaoMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMesa1ActionPerformed(evt);
            }
        });

        botaoMesa2.setBackground(new java.awt.Color(255, 51, 51));
        botaoMesa2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        botaoMesa2.setBorder(null);
        botaoMesa2.setLabel("Mesa 1");
        botaoMesa2.setPreferredSize(new java.awt.Dimension(520, 90));
        botaoMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMesa2ActionPerformed(evt);
            }
        });

        botaoMesa3.setBackground(new java.awt.Color(255, 51, 51));
        botaoMesa3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        botaoMesa3.setBorder(null);
        botaoMesa3.setLabel("Mesa 1");
        botaoMesa3.setPreferredSize(new java.awt.Dimension(520, 90));
        botaoMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMesa3ActionPerformed(evt);
            }
        });

        tituloTelaMesas.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        tituloTelaMesas.setText("Mesas");

        avisoMesa.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        avisoMesa.setText("Nenhum pedido em mesa!");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(tituloTelaMesas)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(avisoMesa)
                        .addGap(144, 144, 144))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTelaMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(botaoMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avisoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(botaoMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(botaoMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        RestaurantePainel.addTab("Pagamento_Mesas", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        ButtonVoltar.setBackground(new java.awt.Color(255, 230, 0));
        ButtonVoltar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ButtonVoltar.setText("←");
        ButtonVoltar.setBorder(null);
        ButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel4.setText("Total:");

        pedido1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pedido1.setText("Pedido 1: Suco, Comida, Arroz");

        pedido2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pedido2.setText("Pedido 1: Suco, Comida, Arroz");

        pedido3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pedido3.setText("Pedido 1: Suco, Comida, Arroz");

        pedidoPreco2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pedidoPreco2.setText(" Preço: R$ 1,00");

        botaoPagar.setBackground(new java.awt.Color(51, 204, 0));
        botaoPagar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        botaoPagar.setText("PAGAR");
        botaoPagar.setBorder(null);
        botaoPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagarActionPerformed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(255, 255, 0));
        titulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Mesa 1");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setOpaque(true);

        pedidoPreco3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pedidoPreco3.setText(" Preço: R$ 1,00");

        pedidoPreco1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pedidoPreco1.setText(" Preço: R$ 1,00");

        precoFull.setBackground(new java.awt.Color(255, 255, 255));
        precoFull.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        precoFull.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoFull.setText("R$ 1,00");
        precoFull.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        precoFull.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(precoFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pedidoPreco3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pedido1)
                                    .addComponent(pedido2)
                                    .addComponent(pedido3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pedidoPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pedidoPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(56, 56, 56))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(ButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedido1)
                    .addComponent(pedidoPreco1))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedido2)
                    .addComponent(pedidoPreco2))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedido3)
                    .addComponent(pedidoPreco3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precoFull, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(botaoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        RestaurantePainel.addTab("Pagamento_Individual", jPanel8);

        getContentPane().add(RestaurantePainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 760, 580));

        jMenu1.setText("Selecionar Tela");

        TelaPedidos.setText("Novo Pedido");
        TelaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaPedidosActionPerformed(evt);
            }
        });
        jMenu1.add(TelaPedidos);

        GoToMesas.setText("Cozinha");
        GoToMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToMesasActionPerformed(evt);
            }
        });
        jMenu1.add(GoToMesas);

        GoToPagMesas.setText("Pagamento");
        GoToPagMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToPagMesasActionPerformed(evt);
            }
        });
        jMenu1.add(GoToPagMesas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaPedidosActionPerformed
        this.clearTelaPedidos();
    }//GEN-LAST:event_TelaPedidosActionPerformed

    private void LMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMesasMouseClicked
        //Guarda o valor da seleção
        SelectionMesas = LMesas.getSelectedIndex();        
        if(!mesas.isEmpty() && SelectionMesas != -1){
            TesteTexto.setText("MESA " + Integer.toString(mesas.get(LMesas.getSelectedIndex()).numero));
            //Atualiza a lista de pedidos dependendo da mesa
                LPedidos.setModel(new javax.swing.AbstractListModel<String>(){
                ArrayList<PedidoClass> P = mesas.get(LMesas.getSelectedIndex()).pedidos;
                @Override
                public int getSize() { return P.size(); }
                @Override
                public String getElementAt(int index) {return P.get(index).toString(); }
            });
        RestaurantePainel.setSelectedIndex(TELA_PEDIDOS);
        }
    }//GEN-LAST:event_LMesasMouseClicked

    private void RestartPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartPedidoActionPerformed
        //Limpa a tela para um novo pedido
        this.clearTelaPedidos();
    }//GEN-LAST:event_RestartPedidoActionPerformed

    private void ButtonFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinalizarPedidoActionPerformed
        MesaClass mesaSelecionada = null;

        // Valida se algum produto foi selecionado
        if (!Product1.isSelected() && !Product2.isSelected()
            && !Product3.isSelected() && !Product4.isSelected()){
            JOptionPane.showMessageDialog(null,
                "Você deve selecionar algum produto.");
            return;
        }

        // Pega a mesa e valida se ela é valida
        int mesa = (Integer)MesaSpinner.getValue();
        if (mesa <= 0){
            JOptionPane.showMessageDialog(null,
                "Você deve selecionar uma mesa apartir do 1.");
            return;

        }

        // Tenta encontrar a mesa nas mesas existentes
        for (MesaClass mesaExist : this.mesas){
            if (mesaExist.numero == mesa){
                mesaSelecionada = mesaExist;
                break;
            }
        }
        // Adiciona a mesa caso não encontre nas mesas existentes
        if (mesaSelecionada == null){
            // antes valida se já chegou no limite de mesas
            if (this.mesas.size() == Tela.MAX_MESAS){
                JOptionPane.showMessageDialog(null,
                    "Limite de mesas atingido, aguarde o pagamento de alguma"
                    + " mesa para liberar uma mesa.");
                return;
            }
            mesaSelecionada = new MesaClass();
            mesaSelecionada.numero = mesa;
            this.mesas.add(mesaSelecionada);
        }

        //Valida se pode adicionar um pedido a mesa
        if (mesaSelecionada.pedidos.size() == Tela.MAX_PEDIDOS){
            JOptionPane.showMessageDialog(null,
                "Não é permitido adição de mais pedidos nesta mesa,"
                + " limite atingido.");
            return;
        }

        // Cria o pedido e já vincula a mesa
        PedidoClass pedido = new PedidoClass();

        // Adiciona os produtos ao pedido
        if (Product1.isSelected()){
            pedido.produtos.add(new ProdutoClass(PRODUTO1));
        }
        if (Product2.isSelected()){
            pedido.produtos.add(new ProdutoClass(PRODUTO2));
        }
        if (Product3.isSelected()){
            pedido.produtos.add(new ProdutoClass(PRODUTO3));
        }
        if (Product4.isSelected()){
            pedido.produtos.add(new ProdutoClass(PRODUTO4));
        }
        //Adiciona um número ao pedido
        pedido.setNum(++REQUESTS_NUM);
        // Adiciona os pedidos na mesa
        mesaSelecionada.pedidos.add(pedido);
        System.out.println("Adicionou pedido: " + pedido);
        
        //Adiciona a mesa à Lista de mesas
        if(!mesaSelecionada.pedidos.isEmpty()){
            LMesas.setModel(new javax.swing.AbstractListModel<String>(){
                ArrayList<MesaClass> M = mesas;
                @Override
                public int getSize() { return M.size(); }
                @Override
                public String getElementAt(int index) {return M.get(index).toString(); }
            });           
        }
        // Vai para a pagina de finalização do pedido
        RestaurantePainel.setSelectedIndex(TELA_PEDIDO3);
    }//GEN-LAST:event_ButtonFinalizarPedidoActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // Vai para pagina de seleção
        RestaurantePainel.setSelectedIndex(TELA_PEDIDO2);
        Product1.setText(PRODUTO1.nome);
        Product2.setText(PRODUTO2.nome);
        Product3.setText(PRODUTO3.nome);
        Product4.setText(PRODUTO4.nome);
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void BotaoMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMesasActionPerformed
        //Vai pra página de mesas
        RestaurantePainel.setSelectedIndex(TELA_MESAS);
    }//GEN-LAST:event_BotaoMesasActionPerformed

    private void LPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPedidosMouseClicked
        //Muda status do pedido pra pronto, caso em aguardo
        if(mesas.get(SelectionMesas).pedidos.get(LPedidos.getSelectedIndex()).status.contains(STATUS_A)){
            if(JOptionPane.showConfirmDialog(LPedidos, "Deseja marcar o pedido como pronto?", "Pronto", 0) == 0)
                mesas.get(SelectionMesas).pedidos.get(LPedidos.getSelectedIndex()).status = STATUS_P;
        }
        //Muda status do pedido pra entregue, caso pronto
        else if(mesas.get(SelectionMesas).pedidos.get(LPedidos.getSelectedIndex()).status.contains(STATUS_P)){
            if(JOptionPane.showConfirmDialog(LPedidos, "Deseja entregar o pedido?", "Entregar", 0) == 0){
                mesas.get(SelectionMesas).pedidos.get(LPedidos.getSelectedIndex()).status = STATUS_E;
            }
        }
    }//GEN-LAST:event_LPedidosMouseClicked

    private void GoToMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToMesasActionPerformed
        //Vai para a tela de mesas
        RestaurantePainel.setSelectedIndex(TELA_MESAS);
    }//GEN-LAST:event_GoToMesasActionPerformed

    private void botaoMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMesa1ActionPerformed
        //Mostra a tela de pagamento interna da mesa
        pagePagamentoInterna(mesas.get(0));
        RestaurantePainel.setSelectedIndex(TELA_PAGAMENTO_INT);
    }//GEN-LAST:event_botaoMesa1ActionPerformed

    private void botaoMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMesa2ActionPerformed
        //Mostra a tela de pagamento interna da mesa
        pagePagamentoInterna(mesas.get(1));
        RestaurantePainel.setSelectedIndex(TELA_PAGAMENTO_INT);
    }//GEN-LAST:event_botaoMesa2ActionPerformed

    private void botaoMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMesa3ActionPerformed
        //Mostra a tela de pagamento interna da mesa
        pagePagamentoInterna(mesas.get(2));
        RestaurantePainel.setSelectedIndex(TELA_PAGAMENTO_INT);
    }//GEN-LAST:event_botaoMesa3ActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        //Mostra a tela de pagamento interna da mesa
        RestaurantePainel.setSelectedIndex(TELA_PAGAMENTOS);
        pagePagamento();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void botaoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagarActionPerformed
        String mesaPagamento;
        mesaPagamento = titulo.getText();
        for (MesaClass mesa : mesas){
            if (mesaPagamento.equals("Mesa " + mesa.numero)){
                for (PedidoClass pedido : mesa.pedidos){
                    if (!pedido.status.equals(STATUS_E)){
                        JOptionPane.showMessageDialog(null,
                            "Todos os pedidos devem estar entregues para "
                            + "pagamento!");
                        return;
                    }
                }
                mesas.remove(mesa);
                LMesas.setModel(new javax.swing.AbstractListModel<String>(){
                    ArrayList<MesaClass> M = mesas;
                    @Override
                    public int getSize() { return M.size(); }
                    @Override
                    public String getElementAt(int index) {return M.get(index).toString(); }
                    }); 
                break;
            }
        }

        JOptionPane.showMessageDialog(null,"Pagamento realizado!");
        RestaurantePainel.setSelectedIndex(Tela.TELA_PAGAMENTOS);
        pagePagamento();
    }//GEN-LAST:event_botaoPagarActionPerformed

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        //Atualiza a tela
        pagePagamento();
    }//GEN-LAST:event_jPanel7MouseMoved

    private void GoToPagMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToPagMesasActionPerformed
        //Vai pra tela de pagamento
        RestaurantePainel.setSelectedIndex(Tela.TELA_PAGAMENTOS);
    }//GEN-LAST:event_GoToPagMesasActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         //</editor-fold>
         
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoMesas;
    private javax.swing.JButton ButtonFinalizarPedido;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JButton EnterButton;
    private javax.swing.JMenuItem GoToMesas;
    private javax.swing.JMenuItem GoToPagMesas;
    private javax.swing.JList<String> LMesas;
    private javax.swing.JList<String> LPedidos;
    private javax.swing.JSpinner MesaSpinner;
    private javax.swing.JToggleButton Product1;
    private javax.swing.JToggleButton Product2;
    private javax.swing.JToggleButton Product3;
    private javax.swing.JToggleButton Product4;
    private java.awt.Button RestartPedido;
    private javax.swing.JTabbedPane RestaurantePainel;
    private javax.swing.JMenuItem TelaPedidos;
    private javax.swing.JLabel TesteTexto;
    private javax.swing.JLabel avisoMesa;
    private javax.swing.JButton botaoMesa1;
    private javax.swing.JButton botaoMesa2;
    private javax.swing.JButton botaoMesa3;
    private javax.swing.JButton botaoPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pedido1;
    private javax.swing.JLabel pedido2;
    private javax.swing.JLabel pedido3;
    private javax.swing.JLabel pedidoPreco1;
    private javax.swing.JLabel pedidoPreco2;
    private javax.swing.JLabel pedidoPreco3;
    private javax.swing.JLabel precoFull;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloTelaMesas;
    // End of variables declaration//GEN-END:variables
}
