package com.joaofelipe.cadastrousuario;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declaração dos componentes visuais e do adaptador da lista
    RecyclerView recyclerView;
    UserAdapter adapter;
    Button btnCadastrar;

    //Atenção: Atributo estático (static) permite que os dados persistam na memória
    //Enquanto o app estiver aberto e sejam acessados diretamente por outras telas (Activities)
    public static List<String> listaNomes = new ArrayList<>();

    //Método de inicialização da Activity (Ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Vincula o arquivo de layout XML (activity_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        //Regra de negócio: insere un texto no topo da lista, caso ela esteja vazia
        if(listaNomes.isEmpty()){
            listaNomes.add("Nomes de cadastro");
        }
    }


}