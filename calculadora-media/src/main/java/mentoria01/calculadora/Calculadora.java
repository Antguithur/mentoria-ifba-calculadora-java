package mentoria01.calculadora;

import java.awt.event.ActionEvent;


public class Calculadora extends CalculadoraForm {


    @Override
    protected void btnCalcularClick(ActionEvent ev) {
        double valor1 = Double.parseDouble(txtNota01.getText().toString());
        double valor2 = Double.parseDouble(txtNota02.getText().toString());
        double valor3 = Double.parseDouble(txtNota03.getText().toString());
        double calc= (valor1 + valor2 + valor3)/3;
        String status;
        double media = 0;

        if(calc >= 7){
            status = "Aprovado";
        }else{
            status = "Reprovado";
        }

        media = Math.round(calc*100.0)/100.0;
        txtMedia.setText(Double.toString(media));
        txtStatus.setText(status);

    }

    @Override
    protected void btnLimparClick(ActionEvent ev) {
        txtNota01.setText("");
        txtNota02.setText("");
        txtNota03.setText("");
        txtMedia.setText("");
        txtStatus.setText("");
    }

    @Override
    protected void btnFecharClick(ActionEvent ev) {
        this.setVisible(false);
        this.dispose();
    }
}
