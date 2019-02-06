package com.codeclan.newsApp.newsApp.components;

import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.models.Journalist;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader() {

    }

    //    title; journalist; content;date; url;image_url;
    public void run(ApplicationArguments args) {

        Journalist steven = new Journalist("Steven");
        journalistRepository.save(steven);

        Journalist chris = new Journalist("Chris");
        journalistRepository.save(chris);

        Journalist tom = new Journalist("Tom");
        journalistRepository.save(tom);

        Journalist david = new Journalist("David");
        journalistRepository.save(david);

        GregorianCalendar date1 = new GregorianCalendar(2018, 10, 5);
        GregorianCalendar date2 = new GregorianCalendar(1999, 12, 12);
        GregorianCalendar date3 = new GregorianCalendar(2005, 8, 13);
        GregorianCalendar date4 = new GregorianCalendar(2019, 02, 3);

        ArrayList <GregorianCalendar> date = new ArrayList <>();
        date.add(date1);
        date.add(date2);
        date.add(date3);
        date.add(date4);
        Collections.sort(date);
        ;
        Article article1 = new Article("Blue 'Smurf cats' and dogs after Clacton ink fire", "The pets were a little off-colour after sacks of ink powder ruptured in a fire were blown around parts of Clacton, Essex, in the wind. The fire broke out in a shed on Tuesday, the East Anglian Daily Times first reported. Essex Fire Service said the powder was non-hazardous and was expected to fade as the animals were washed.", "https://tinyurl.com/y8gjpkjm", "https://ichef.bbci.co.uk/news/660/cpsprodpb/1B33/production/_105436960_blue1.jpg", date1, "Cats and dogs were left resembling Smurfs when the air turned blue in a seaside town.", david);
        articleRepository.save(article1);

        Article article2 = new Article("Owner gets stuck up tree trying to rescue own cat", "A pet owner had to be rescued from a tree after climbing it to free her missing cat. Maria Parry spent \"three days of searching and no sleep\" after Harry the tabby disappeared from her home in Fareham, Hampshire. When she found the bedraggled moggy in a back garden she climbed the tree \"by instinct\" to comfort him before getting stuck herself. Hampshire Fire and Rescue Service said the pair were rescued using a ladder.", "https://tinyurl.com/y8vt343j", "https://ichef.bbci.co.uk/news/660/cpsprodpb/FDCB/production/_105217946_3890393e-bbc1-49ef-bd83-d8c392f4eda3.jpg", date2, "A pet owner had to be rescued from a tree after climbing it to free her missing cat.", chris);
        articleRepository.save(article2);

        Article article3 = new Article("Does my cat purr when it’s alone in the house?", "Cats don't just purr because they're happy or content, they also purr in response to injury or pain. It is believed that the frequency of purring contributes to some sort of healing mechanism. But even if cats purr due to happiness from snuggling on their servants' laps, we can't assume that it's the main or only reason they purr from joy.", "https://tinyurl.com/y92z4qbr", "https://i.guim.co.uk/img/media/3234add42a2daac965d5ea91ad7d15975e29d176/0_1013_4500_2700/master/4500.jpg?width=620&quality=45&auto=format&fit=max&dpr=2&s=e1d3bd72595f0b17f13f1c95ce339039", date3, "Does my cat purr when I’m not there? It purrs on my knee or sitting on a windowsill when I’m in the same room. But does it purr when alone in the house?", steven);
        articleRepository.save(article3);

        Article article4 = new Article("When 9-Year-old Sees a Kitten Who Can’t Walk, He Builds a Tiny Wheelchair to Change Its Life", "A clever 9-year-old boy has transformed the life of a kitten after he noticed that it was unable to play to play with its siblings. João, who is from Paraná, Brazil, first met the little feline during a recent visit to his neighbor’s house. The neighbors were caring for a litter of kittens that had been born only weeks earlier – and while they were all cute as could be, there was one cat in particular that caught João’s eye. Unable to stop thinking about the disabled animal, João started brainstorming about how he could help her.", "https://tinyurl.com/y9ynruep", "https://d3pz1jifuab5zg.cloudfront.net/2017/08/24113229/earl-in-chair.jpg", date4, "A clever 9-year-old boy has transformed the life of a kitten after he noticed that it was unable to play to play with its siblings.", tom);
        articleRepository.save(article4);

        Article article5 = new Article("Colorado jogger chokes mountain lion to death after wild cat attacked him on mountain trail", "A jogger killed a mountain lion with his bare hands after the animal attacked him on a trail in the foothills of the Rockies. The runner heard the wild cat behind him and, as he turned, it pounced and began savaging him, pouncing at his head, and clawing and biting his face and arms. He managed to fend it off with his forearms and then jumped on top of the animal, somehow managing to suffocate it. The man, who has not been identified, suffered bites to his face, arms, legs and back. But he was still able to hike to hospital, where he was being treated for serious, non-life threatening injuries.", "https://tinyurl.com/ya2xwuwn", "https://www.telegraph.co.uk/content/dam/news/2019/02/05/TELEMMGLPICT000187538520_trans_NvBQzQNjv4BqwtUT54c80eKHJHMfvK9NImtWLkXH92jWt3mkAOR8y98.jpeg?imwidth=1400", date3, "A jogger killed a mountain lion with his bare hands after the animal attacked him on a trail in the foothills of the Rockies.", steven);
        articleRepository.save(article5);




    }
}