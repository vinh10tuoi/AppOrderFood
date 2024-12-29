package com.example.appfood5.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appfood5.Adapter.CartAdapter;
import com.example.appfood5.Helper.ChangeNumberItemsListener;
import com.example.appfood5.Helper.ManagmentCart;
import com.example.appfood5.R;
import com.example.appfood5.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {
    private ActivityCartBinding binding;
    private RecyclerView.Adapter adapter;
    private ManagmentCart managmentCart;

    private double tax;
    private double delivery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_cart);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backBtn), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
         managmentCart = new ManagmentCart(this);

         setVariable();
         calculateCart();
         initlist();

    }

    private void initlist() {
        if(managmentCart.getListCart().isEmpty()) {
            binding.emptyTxt.setVisibility(View.VISIBLE);
            binding.scrollviewCart.setVisibility(View.GONE);
        }else{
            binding.emptyTxt.setVisibility(View.GONE);
            binding.scrollviewCart.setVisibility(View.VISIBLE);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.cardView.setLayoutManager(linearLayoutManager);
        adapter = new CartAdapter(managmentCart.getListCart(), this, new ChangeNumberItemsListener() {
            @Override
            public void change() {
                calculateCart();
            }
        });
        binding.cardView.setAdapter(adapter);
    }

    private void calculateCart() {
        double percentTax = 0.10; //phần trăm thuế
        double percentDelivery= 0.05; //phần trăm tiền ship

        tax = Math.round(managmentCart.getTotalFee()*percentTax*100.0)/100;
        delivery = Math.round(managmentCart.getTotalFee()*percentDelivery*100.0)/100;
        double total = Math.round((managmentCart.getTotalFee() + tax + delivery) * 100)/100;
        double itemTotal = Math.round(managmentCart.getTotalFee() * 100)/100;

        binding.totalFeeTxt.setText("VND" + itemTotal);
        binding.taxTxt.setText("VND" + tax);
        binding.deliveryTxt.setText("VND" + delivery);
        binding.totalTxt.setText("VND" + total);
    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}