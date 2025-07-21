package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

    private static final String[] colunas = {"ID", "Marca", "Modelo", "Ano", "Cor", "Estado", "Caracteristicas", "Acessorios", "Valor"};
    private ArrayList<Carro> arrayListCarros;

    public ModeloTabela(ArrayList<Carro> carro) {
        super();
        this.arrayListCarros = carro;
        carro.forEach(c->atualizarCarro(c));

    }

    public void adicionarCarro(Carro carro) {
        this.arrayListCarros.add(carro);// = carro;
        fireTableDataChanged();
    }

    public String getColumnMarca(int column) {
        return colunas[column];
    }

    public int getRowCount() {
        return arrayListCarros.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Carro carro = arrayListCarros.get(rowIndex);
        if (columnIndex == 0) {
            return carro.getId();
        } else if (columnIndex == 1) {
            return carro.getMarca();
        } else if (columnIndex == 2) {
            return carro.getModelo();
        } else if (columnIndex == 3) {
            return carro.getAno();
        } else if (columnIndex == 4) {
            return carro.getCor();
        } else if (columnIndex == 5) {
            return carro.getEstado();
        } else if (columnIndex == 6) {
            return carro.getCaracteristicas();
        } else if (columnIndex == 7) {
            return carro.getAcessorios();
        } else if (columnIndex == 8) {
            return carro.getValor();
        } else {
            return null;
        }

    }

    public void atualizarCarro(Carro carroAtualizado) {
        for (int i = 0; i < arrayListCarros.size(); i++) {
            if (arrayListCarros.get(i).getId().equals(carroAtualizado.getId())) {
                arrayListCarros.set(i, carroAtualizado);
                fireTableRowsDeleted(i, i);
                break;

            }
            fireTableDataChanged();
        }
    }

//    public void removerCarroPorId(String id) {
//        for (int i = 0; i < arrayListCarros.size(); i++){
//            if(arrayListCarros.get(i).getId().equals(id)){
//               arrayListCarros.remove(i);
//               fireTableDataChanged();
//               break;
//            }
//        }
//    }
    public void removerCarroPorId() {
    }

}
