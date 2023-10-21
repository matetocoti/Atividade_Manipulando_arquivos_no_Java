package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {


    // Lista de pedidos
    List<ItemPedido> itemPedidoList = new ArrayList<>();



    // Default
    public Pedidos(){}



    public void addItem(ItemPedido item){
        itemPedidoList.add(item);
    }
    public void removeItem(ItemPedido item){
        itemPedidoList.remove(item);
    }
}
