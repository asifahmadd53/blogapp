package com.example.blogapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Apply system window insets for padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the RecyclerView
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ArticlesAdapter(getArticles())
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

    // Function to get a list of articles
    fun getArticles(): List<Article> {
        return listOf(
            Article(
                R.drawable.img1,
                "Ukraine Strikes a Russian Oil Hub as Zelenskyy Says the War Is in 'a Very Important Phase'",
                "Ukraine launched a strategic strike on a Russian oil facility, dealing a significant blow to Russia’s energy infrastructure. This attack underscores the intensifying conflict, as President Zelenskyy declares that the war has reached a 'very important phase'—with Ukraine focusing on weakening Russia’s economic strongholds while Western allies continue to support its military efforts."
            ),
            Article(
                R.drawable.img2,
                "A Strike on a Mosque Kills 19 as Israel Bombards Northern Gaza and Southern Beirut",
                "As Israel ramps up its offensive in Northern Gaza and targets Hezbollah positions in Southern Beirut, a tragic airstrike on a Gaza mosque has killed 19 civilians. The incident has sparked international outrage, deepening the humanitarian crisis in the region as calls for ceasefire intensify. The conflict between Israel and its neighbors shows no signs of abating, leaving the international community grappling with how to mediate peace."
            ),
            Article(
                R.drawable.img3,
                "Collapse of Cyber Firm Founded by Former NSA Chief Leaves Bitter Wake",
                "The unexpected collapse of a high-profile cybersecurity firm founded by a former NSA chief has left a trail of disgruntled investors and clients. Promising revolutionary advancements in cyber defense, the company’s downfall is being attributed to poor management and unfulfilled promises. This event raises broader concerns about the stability and credibility of private cybersecurity enterprises, especially as the threat of cyber warfare continues to grow globally."
            ),
            Article(
                R.drawable.img4,
                "A Year After Hamas Attack, More Continuity than Change for the Palestinians and Israel",
                "One year after the deadly Hamas-led attack that shocked the region, the Israeli-Palestinian conflict remains entrenched in a cycle of violence, with little progress toward peace. Despite diplomatic efforts and international interventions, the core issues remain unresolved. The situation continues to strain relations across the Middle East, as the humanitarian toll rises and both sides prepare for potential escalations."
            ),
            Article(
                R.drawable.img5,
                "How Jon Stewart's Visits with Wounded Iraq War Veterans Shaped his Military Advocacy",
                "Jon Stewart’s advocacy for military veterans stems from his personal experiences visiting wounded Iraq War soldiers. His connection to these veterans profoundly influenced his public support for improved healthcare and benefits for servicemembers. Stewart has become a prominent voice for veterans' rights, using his platform to challenge government policies and call for systemic reforms in how veterans are treated, particularly those who suffer from physical and psychological trauma."
            ),
            Article(
                R.drawable.img2,
                "How Jon Stewart's Visits with Wounded Iraq War Veterans Shaped his Military Advocacy",
                "Jon Stewart's efforts in advocating for veterans' welfare took shape during his visits to hospitals caring for wounded Iraq War soldiers. Witnessing the devastating effects of the war firsthand inspired Stewart to use his influence to champion the cause of military veterans, particularly in areas of mental health and healthcare reform. His advocacy has brought attention to the gaps in support for those returning from combat."
            ),
            Article(
                R.drawable.img1,
                "Ukraine Strikes a Russian Oil Hub as Zelenskyy Says the War Is in 'a Very Important Phase'",
                "Ukraine's decision to target a critical Russian oil hub marks a pivotal moment in the ongoing war. With energy resources playing a central role in funding the Russian military, Ukraine's strike signifies a strategic push to cripple Russia’s capabilities. Zelenskyy has emphasized the importance of this phase in the war, as both sides continue to push for tactical advantages."
            )
        )
    }
}
