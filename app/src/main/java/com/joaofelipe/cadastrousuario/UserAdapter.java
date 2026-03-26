package com.joaofelipe.cadastrousuario;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//CLasse Adapter: Gerencia a criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    //Atributo privado que armazena a referencia dos dados que serão exibidos
    private List<String> listaUsuarios;

    //Construtor que permite  a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(list<Sting> lista){
        this.listaUsuarios = lista;

    }

    //Método1: Cria "do zero" o visual de uma linha de lista (+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        //LayoutInflater transforma o arquivo XML em um objeto View Java
        //Aqui usamos um layout padrão do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
    }
}
