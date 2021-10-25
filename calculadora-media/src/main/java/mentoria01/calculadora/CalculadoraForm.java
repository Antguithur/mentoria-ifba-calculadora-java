package mentoria01.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CalculadoraForm extends JFrame {

    //criação de uma constante para dimensionar o painel da calculadora
    private static final int TAMANHO_TXT = 15;


    //criação dos paineis
    protected JPanel plnForm;
    protected JPanel plnRodape;

    //botão calcular
    protected JButton btnCalcular;
    //bot�o limpar
    protected JButton btnLimpar;
    //bot�o fechar
    protected JButton btnFechar;

    //Primeira Nota
    protected JLabel lblNota01;
    protected JTextField txtNota01;
    //Segunda Nota
    protected JLabel lblNota02;
    protected JTextField txtNota02;
    //Terceira Nota
    protected JLabel lblNota03;
    protected JTextField txtNota03;
    //M�dia calculada
    protected JLabel lblMedia;
    protected JTextField txtMedia;
    //Status
    protected JLabel lblStatus;
    protected JTextField txtStatus;

    private void inicializar(){

        this.setTitle("Calculator de Media");
        //this.setSize(640,480);
        //this.pack(); não é ideal, temos que colocar após os componentes

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.getContentPane().setLayout(new BorderLayout());

        this.setResizable(false);


        this.getContentPane().add(getPlnForm(),BorderLayout.CENTER);

        this.getContentPane().add(getPlnRodape(),BorderLayout.PAGE_END);

        this.pack();


    }


    protected abstract void btnCalcularClick(ActionEvent ev);
    protected abstract void btnLimparClick(ActionEvent ev);
    protected abstract void btnFecharClick(ActionEvent ev);

        private void eventos(){


            btnFechar.addActionListener(this::btnFecharClick);
            btnLimpar.addActionListener(this::btnLimparClick);
            btnCalcular.addActionListener(this::btnCalcularClick);

        }

    public CalculadoraForm(){
        this.inicializar();
        this.eventos();
    }

    public JPanel getPlnForm(){
        if(plnForm == null){
            plnForm = new JPanel(new GridLayout(5,2));

            //Criação dos objetos Labels e Texts
            lblNota01 = new JLabel("Primeira Nota");
            txtNota01 = new JTextField(TAMANHO_TXT);

            lblNota02 = new JLabel("Segunda Nota");
            txtNota02 = new JTextField(TAMANHO_TXT);

            lblNota03 = new JLabel("Terceira Nota");
            txtNota03 = new JTextField(TAMANHO_TXT);

            lblMedia = new JLabel("Media Calculada");
            txtMedia = new JTextField(TAMANHO_TXT);

            txtMedia.setEditable(false);

            lblStatus = new JLabel("Status");
            txtStatus = new JTextField(TAMANHO_TXT);

            txtStatus.setEditable(false);

            //Adicionar os Labels e Texts no Painel
            plnForm.add(lblNota01);
            plnForm.add(txtNota01);
            plnForm.add(lblNota02);
            plnForm.add(txtNota02);
            plnForm.add(lblNota03);
            plnForm.add(txtNota03);
            plnForm.add(lblMedia);
            plnForm.add(txtMedia);
            plnForm.add(lblStatus);
            plnForm.add(txtStatus);
        }
        return plnForm;
    }

    public JPanel getPlnRodape(){
        if(plnRodape == null){
            plnRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

            //Criação do objeto botão
            btnCalcular = new JButton("Calcular");
            btnLimpar = new JButton("Limpar");
            btnFechar = new JButton("Fechar");

            //Adicionar o botão no painel
            plnRodape.add(btnCalcular);
            plnRodape.add(btnLimpar);
            plnRodape.add(btnFechar);
        }
        return plnRodape;
    }



}
