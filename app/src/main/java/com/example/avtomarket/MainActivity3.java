package com.example.avtomarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    String mercedec = "Mercedes-AMG G 63 — яркий пример того, как дизайн подчеркивает выдающиеся динамические и внедорожные возможности. Мощный, внушительный, солидный, с первого же взгляда он настраивает на то, что поездке ничто не помешает. А салон, обтянутый алькантарой, с декоративными вставками из дерева или карбона создает атмосферу роскоши и смотрится великолепно в любом оттенке.";
    String mercedec2 = "Специальная цена действительна при сдаче в Trade-in автомобиля «Mercedes-Benz» или другого премиального бренда, оформлении полиса КАСКО и кредита в «Мерседес-Бенц Банк Рус». На автомобилях может быть установлено дополнительное оборудование, в связи с чем конечная цена автомобиля может отличаться от начальной или специальной (с учетом скидок и программ) цены на стоимость установленного дополнительного оборудования.";
    String mercedec3 = "AMG G 63 устанавливается битурбированный двигатель V8, рабочий объем которого составляет 4 л. Его мощность равна 585 л.с. В качестве трансмиссии предлагается 9-ступенчатая АКПП AMG SPEEDSHIFT 9G TRONIC.";

    String bmw = "В 1919 году Франц Димер установил первый мировой рекорд BMW, поднявшись на высоту 9760 метров на аэроплане с двигателем BMW. После Первой мировой войны по условиям Версальского мирного договора 1919 года было запрещено производство самолётов в Германии, вследствие чего Густав Отто закрыл свою фабрику, а BMW перешла на производство сельскохозяйственной техники, предметов домашнего обихода и тормозов для поездов.";
    String bmw2 = "В 1927 году было установлено 87 мировых авиарекордов, 29 из них — на самолётах с двигателями BMW.";
    String bmw3 = " В 1923 году на фабрике в Мюнхене выпущен первый мотоцикл BMW. В 1924 году на самолёте, оснащённом двигателями BMW, состоялся первый межконтинентальный полёт в Персию. В 1926 году гидросамолёт Rohrbach Ro VII с двигателями BMW VI устанавливает";


    String air = "";
    String air2 = "";
    String air3 = "";

    String cat = "Meow meow";
    String cat2 = "Masha";
    String cat3 = "Masha meow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView = findViewById(R.id.imageview3);
        textView = findViewById(R.id.textview3);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int image = intent.getIntExtra("image",0);
        textView.setText(name);
        imageView.setImageResource(image);
        switch (name){
            case "MerCedecG63":
                textView.setText(name + "\n" + mercedec);
                break;

            case "MerCedecG64":
                textView.setText(name + "\n" + mercedec2);
                break;

            case "MerCedecG65":
                textView.setText(name + "\n" + mercedec3);
                break;

            case "BMW X5":
                textView.setText(name + "\n" + bmw);
                break;

            case "BMW X6":
                textView.setText(name + "\n" + bmw2);
                break;

            case "BMW X7":
                textView.setText(name + "\n" + bmw3);
                break;

            case "Cat1":
                textView.setText(name + "\n" + cat);
                break;

            case "Cat2":
                textView.setText(name + "\n" + cat2);
                break;

            case "Cat3":
                textView.setText(name + "\n" + cat3);
                break;
        }


    }
}