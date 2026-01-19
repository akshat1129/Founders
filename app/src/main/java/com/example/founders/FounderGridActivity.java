package com.example.founders;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FounderGridActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MyListData> founderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_founder_grid);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        founderList = new ArrayList<>();

        founderList.add(new MyListData(
                "Steve Jobs",
                "Steven Paul Jobs (February 24, 1955 – October 5, 2011) was an American businessman, inventor, and investor best known for co-founding the technology company Apple Inc. Jobs was also the founder of NeXT and chairman and majority shareholder of Pixar. He was a pioneer of the personal computer revolution of the 1970s and 1980s, along with his early business partner and fellow Apple co-founder Steve Wozniak.\n" +
                        "\n" +
                        "Jobs was born in San Francisco in 1955 and adopted shortly afterwards. He attended Reed College in 1972 before withdrawing that same year. In 1974, he traveled through India, seeking enlightenment before later studying Zen Buddhism. He and Wozniak co-founded Apple in 1976 to further develop and sell Wozniak's Apple I personal computer. Together, the duo gained fame and wealth a year later with production and sale of the Apple II, one of the first highly successful mass-produced microcomputers.",
                R.drawable.steve_jobs));

        founderList.add(new MyListData(
                "Bill Gates",
                "William Henry Gates III (born October 28, 1955) is an American businessman and philanthropist. A pioneer of the microcomputer revolution of the 1970s and 1980s, he co-founded the software company Microsoft in 1975 with his childhood friend Paul Allen. Following Microsoft's 1986 initial public offering, Gates became the world's then-youngest billionaire in 1987, at age 31. Forbes magazine ranked him as the world's wealthiest person for 18 out of 24 years between 1995 and 2017, including 13 years consecutively from 1995 to 2007. Gates became the first centibillionaire in 1999, when his net worth briefly surpassed US$100 billion. According to Forbes, as of May 2025, his net worth stood at US$115.1 billion, making him the thirteenth-richest individual in the world.[1][2][3]",
                R.drawable.bill_gates));

        founderList.add(new MyListData(
                "Elon Musk",
                "Elon Reeve Musk (/ˈiːlɒn/ EE-lon; born June 28, 1971) is a businessman and entrepreneur known for his leadership of Tesla, SpaceX, Twitter, and xAI. Musk has been the wealthiest person in the world since 2021; as of December 2025, Forbes estimates his net worth to be around US$779 billion.\n" +
                        "\n" +
                        "Born into a wealthy family in Pretoria, South Africa, Musk emigrated in 1989 to Canada; he has Canadian citizenship since his mother was born there. He received bachelor's degrees in 1997 from the University of Pennsylvania in Philadelphia, United States, before moving to California to pursue business ventures. In 1995, Musk co-founded the software company Zip2. Following its sale in 1999, he co-founded X.com, an online payment company that later merged to form PayPal, which was acquired by eBay in 2002. Musk also became an American citizen in 2002.",
                R.drawable.elon_musk));

        founderList.add(new MyListData(
                "Bernard Arnault",
                "Bernard Jean Étienne Arnault[a] (born 5 March 1949) is a French businessman. He is the chairman and chief executive officer of LVMH, the world's largest luxury goods company.[2][3] Arnault is one of the richest individuals in the world; as of December 2025, he has an estimated net worth of US$190.4 billion according to Forbes and US$203 billion according to the Bloomberg Billionaires Index.[4][5]\n" +
                        "\n" +
                        "Born in Roubaix, Arnault was raised in a devoutly Catholic household. He studied civil engineering and mathematics at École Polytechnique, graduating in 1971.[6] He began his career in his father's company, Ferret-Savinel, shifting its focus to real estate, which laid the groundwork for his future career in the luxury goods market.",
                R.drawable.bernard_arnault));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(founderList);
        recyclerView.setAdapter(adapter);
    }
}
