package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest2 {
    public static void main(String[] args) {

        String[] questions = {
                " expend energy, enjoy groups.",
                " more outgoing, think out loud.",
                " seek many tasks, public activities,interaction with others.",
                " external communicative, express yourself.",
                " active, initiate",
                " interpret literally",
                " practical, realistic, experimental.",
                " standard, usual, conventional.",
                " focus on here-and-now.",
                " facts, things, what is",
                " logical, thinking, questioning.",
                " candid, straight forward, frank.",
                " firm, tend to criticise, hold the line.",
                " tough-minded, just.",
                " matter of facts, issue-oriented.",
                " organised, orderly.",
                " plan, schedule.",
                " regulated, structured.",
                " preparation, plan ahead.",
                " control, govern.",
        };
        String [] questionB = {
                "conserve energy, enjoy one-on-one",
                "more reserved, think to yourself",
                "seek private, solitary activities with quiet to concentrate",
                "internal, reticent, keep to yourself",
                "reflective, deliberate",
                "look for meaning and possibilities",
                "imaginative, innovative, theoretical",
                "different, novel, unique",
                "look to the future, global perspective, big picture",
                "ideas, dreams, what could be, philosophical",
                "empathetic, feeling, accommodating",
                "tactful, kind, encouraging",
                "gentle, tend to appreciate, conciliate",
                " tender-hearted, merciful",
                "sensitive, people-oriented, compassionate",
                "flexible, adaptable",
                "unplanned, spontaneous",
                "easy-going, live, and let live",
                "go with the flow, adapt as you go",
                "latitude, freedom"
        };

        answers(questions, questionB);

    }

    public static void answers(String[] array, String [] question) {
        Scanner check = new Scanner(System.in);
        int result = 0;
        int total = 0;
        String answer = "";
        String [] answera = {"E", "S", "T", "J"};
        String [] answersb = {"I", "N", "F", "P"};
        String[][] answerBank = new String[4][5];
        String point = "";
        for (int extovert = 0; extovert < 5; extovert++) {
            System.out.println("A." + array[extovert] + "\t\t" + "B." + question[extovert]);
            answer = check.next();
            if (answer.equalsIgnoreCase("a")|| answer.equalsIgnoreCase("A")) {
                answerBank[0][extovert] = answer +". "+array[extovert];
            } else if (answer.equalsIgnoreCase("b")|| answer.equalsIgnoreCase("B")) {
                answerBank[0][extovert] = answer +". "+question[extovert];
            }
            while (!(answer.equals("a")||answer.equals("A")) && !(answer.equals("b")||answer.equals("B"))) {
                System.out.println(array[extovert] + "\t\t" + question[extovert]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a")|| answer.equalsIgnoreCase("A")) {
                    answerBank[0][extovert] = answer +". "+ array[extovert];
                } else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("B")) {
                    answerBank[0][extovert] = answer +". "+question[extovert];
                }
            }
        }
        int count = 0;
        for (int sensing = 5; sensing < 10; sensing++) {
            System.out.println(array[sensing] + "\t\t" + question[sensing]);
            answer = check.next();
            if (answer.equalsIgnoreCase("a")|| answer.equalsIgnoreCase("A")) {
                answerBank[1][count] = answer +". "+array[sensing];
            } else if (answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("B")) {
                answerBank[1][count] = answer +". "+question[sensing];
            }
            count++;
            while (!(answer.equals("a")||answer.equals("A")) && !(answer.equals("b")||answer.equals("B"))) {
                System.out.println(array[sensing] +". "+"\t\t" + question[sensing]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("A")) {
                    answerBank[1][count] = answer +". "+array[sensing];
                } else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("B")) {
                    answerBank[1][count] = answer +". "+question[sensing];
                }
            }
        }
        count = 0;
        for (int thinking = 10; thinking < 15; thinking++) {
            System.out.println(array[thinking] + "\t\t" + question[thinking]);
            answer = check.next();
            if (answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("A")) {
                answerBank[2][count] = answer +". "+array[thinking];
            } else if (answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("B")) {
                answerBank[2][count] = answer +". "+question[thinking];
            }
            count++;
            while (!(answer.equals("a")||answer.equals("A")) && !(answer.equals("b")||answer.equals("B"))) {
                System.out.println(array[thinking] + "\t\t" + question[thinking]);
                answer = check.nextLine();
                if (answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("A")) {
                    answerBank[2][count] = answer +". "+array[thinking];
                } else if (answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("B")) {
                    answerBank[2][count] = answer +". "+question[thinking];
                }
            }

        }
        count = 0;
        for (int judging = 15; judging < 20; judging++) {
            System.out.println(array[judging] + "\t\t" + question[judging]);
            answer = check.next();
            if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("A")) {
                answerBank[3][count] = answer +". "+array[judging];
            } else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("B")) {
                answerBank[3][count] = answer +". "+question[judging];
            }
            count++;
            while (!(answer.equals("a")||answer.equals("A")) && !(answer.equals("b")||answer.equals("B"))){
                System.out.println(array[judging] + "\t\t" + question[judging]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("A")) {
                    answerBank[3][count] = answer +". "+array[judging];
                } else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("B")) {
                    answerBank[3][count] = answer +". "+question[judging];
                }
            }
        }
        System.out.println(Arrays.deepToString(answerBank));
        int numberExtrovert = 0;
        int numberIntrovert = 0;
        int numberSensing = 0;
        int numberIntuitive = 0;
        String response;
        for (int i = 0; i < answerBank.length; i++) {
            for (int j = 0; j < answerBank[i].length; j++) {
                    response = answerBank[i][j];
                    System.out.println(response);
                    if (response.startsWith("a")||response.startsWith("A")) {
                        numberExtrovert++;
                    } else {
                        numberIntrovert++;
                    }
            }
            if(numberExtrovert > numberIntrovert){
                point += answera[i];
            }else {
                point += answersb[i];
            }
            System.out.println("Number of A is " + numberExtrovert);
            System.out.println("Number of B is " + numberIntrovert);
            System.out.println();
            System.out.println(point);
            numberExtrovert = 0;
            numberIntrovert = 0;
            System.out.println();

          }
        if(point.equals("ESTP")){
            System.out.println("""
                                  Entrepreneurs(16Personalities)
                                  The ESTP Personality Type
                                  Entrepreneurs always have an impact on their immediate surroundings – the best way to
                                  spot them at a party is to look for the whirling eddy of people flitting about them as
                                  they move from group to group. Laughing and entertaining with a blunt and earthy humor,
                                  Entrepreneur personalities love to be the center of attention. If an audience member is
                                  asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.
                                  What does ESTP stand for?
                                  Entrepreneurs are the likeliest personality type to make a lifestyle of risky behavior.
                                  They live in the moment and dive into the action – they are the eye of the storm.
                                  People with the Entrepreneur personality type enjoy drama, passion, and pleasure,
                                  not for emotional thrills, but because it’s so stimulating to their logical minds.
                                  They are forced to make critical decisions based on factual, immediate reality in
                                  a process of rapid-fire rational stimulus response.
                    """);
        }
        else if(point.equals("INFJ")){
            System.out.println("""
                                  Advocates(16Personalities)
                                  The INFJ personality Type
                                  Advocates (INFJs) may be the rarest personality type of all, but they certainly leave
                                  their mark on the world. Idealistic and principled, they aren’t content to coast through
                                  life – they want to stand up and make a difference. For Advocate personalities, success
                                  does not come from money or status but from seeking fulfillment, helping others,
                                  and being a force for good in the world.
                                  While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers.
                                  People with this personality type care about integrity, and they’re rarely satisfied until
                                  they’ve done what they know to be right. Conscientious to the core, they move through life
                                  with a clear sense of their values, and they aim never to lose sight of what truly matters – not
                                  according to other people or society at large, but according to their own wisdom and intuition.
                                  
                                  What does INFJ stands for ?
                                   Perhaps because their personality type is so uncommon, Advocates tend to carry around a sense –
                                   whether conscious or not – of being different from most people. With their rich inner lives and
                                   their deep, abiding desire to find their life purpose, they don’t always fit in with those around them.
                                   This isn’t to say that Advocates can’t enjoy social acceptance or close relationships – only that they
                                   sometimes feel misunderstood or at odds with the world.
                                   Fortunately, this sense of being out of step doesn’t diminish Advocates’ commitment to making
                                   the world a better place. Advocates are troubled by injustice, and they typically care more
                                   about altruism than personal gain. They often feel called to use their strengths – including
                                   creativity, imagination, and sensitivity – to uplift others and spread compassion.
                                  
                    """);
        }
        else if(point.equals("INFP")){
            System.out.println("""
                                  Mediator(16Personalities)
                                  The INFP personality type
                                  Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives.
                                  Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories
                                  and conversations in their minds. These personalities are known for their sensitivity – Mediators
                                  can have profound emotional responses to music, art, nature, and the people around them.
                                  Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others.
                                  But because this personality type makes up such a small portion of the population, Mediators may sometimes feel
                                  lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.
                                  All that is gold does not glitter; not all those who wander are lost; the old that is strong does not wither;
                                  deep roots are not reached by the frost.
                                  
                                  What does INFP stands for ?
                                  Mediators share a sincere curiosity about the depths of human nature. Introspective to the core, they’re exquisitely
                                  attuned to their own thoughts and feelings, but they yearn to understand the people around them as well. Mediators
                                  are compassionate and nonjudgmental, always willing to hear another person’s story. When someone opens up to them
                                  or turns to them for comfort, they feel honored to listen and be of help.
                                  Empathy is among this personality type’s greatest gifts, but at times it can be a liability. The troubles of the
                                  world weigh heavily on Mediators’ shoulders, and these personalities can be vulnerable to internalizing other
                                  people’s negative moods or mindsets. Unless they learn to set boundaries, Mediators may feel overwhelmed by
                                  just how many wrongs there are that need to be set right.
                    """);
        }
        else if(point.equals("ENFJ")){
            System.out.println("""
                                  Protagonist(16Personalities)
                                  The ENFJ personality type
                                  Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic, these personality
                                  types strive to have a positive impact on other people and the world around them. They rarely shy away from an opportunity
                                  to do the right thing, even when doing so is far from easy.
                                  Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches,
                                  and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their
                                  lives, including their relationships. Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends
                                  and loved ones to grow into their best selves.
                                  
                                  What does ENFJ stands for ?
                                  Protagonists tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust
                                  or wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak
                                  in ways that resonate with others.
                                  These personality types have an uncanny ability to pick up on people’s underlying motivations and beliefs.
                                  At times, they may not even understand how they come to grasp another person’s mind and heart so quickly.
                                  These flashes of insight can make Protagonists incredibly persuasive and inspiring communicators.
                                  Protagonists’ secret weapon is their purity of intent. Generally speaking, they are motivated by a sincere
                                  wish to do the right thing rather than a desire to manipulate or have power over other people. Even when they disagree with
                                  someone, Protagonists search for common ground. The result is that people with this personality type can communicate with an
                                  eloquence and sensitivity that are nearly impossible to ignore – particularly when they speak about matters that are close
                                  to their hearts.
                    """);
        } else if (point.equals("ENFP")) {
            System.out.println("""
                                  Campaigners(16Personalities)
                                  The ENFP personality type
                                  Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life,
                                  they stand out in any crowd. But even though they can be the life of the party, Campaigners don’t just care about having a good
                                  time. These personality types run deep – as does their longing for meaningful, emotional connections with other people.
                                  Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives. But beneath their sociable,
                                  easygoing exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity,
                                  a Campaigner simply wouldn’t be a Campaigner.
                                  In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life
                                  – even when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected,
                                  and they live for the glimmers of insight that they can gain into these connections.
                                  
                                  What does ENFP stands for ?
                                  Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives. But beneath their sociable, easygoing
                                  exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity, a Campaigner simply
                                  wouldn’t be a Campaigner.
                                  In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life – even
                                  when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected, and they
                                  live for the glimmers of insight that they can gain into these connections.
                    """);
        }
        else if (point.equals("ISTJ")) {
            System.out.println("""
                                  Logisticians(16Personalities)
                                  The ISTJ personality type
                                  Logisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something,
                                  they make sure to follow through. This personality type makes up a good portion of the overall population, and while logisticians may not be 
                                  particularly flashy or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation. In their families and
                                  their communities, Logisticians often earn respect for their reliability, their practicality, and their ability to stay grounded and logical,
                                  even in the most stressful situations.
                                  
                                  What does ISTJ stands for ?
                                  The core of Logisticians’ self-respect comes from a sense of personal integrity. People with this personality type believe that there is a right
                                  way to proceed in any situation – and that anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes.
                                  Logisticians have a deep respect for structure and tradition, and they are often drawn to organizations, workplaces, and educational settings
                                  that offer clear hierarchies and expectations.
                                  
                                  For many Logisticians, a lack of structure offers not freedom, but chaos.
                                  People with the Logisticians personality type rarely hesitate to take responsibility for their actions and choices. Generally speaking, they
                                  are quick to own up to their own mistakes, admitting the truth even if it doesn’t make them look good. To Logisticians, honesty is far more 
                                  important than showmanship, and they’d rather satisfy their own conscience than lie to impress someone else.
                    """);
        }
        else if(point.equals("ISFJ")){
            System.out.println("""
                                  Defender(16Personalities)
                                  The ISFJ personality type
                                  In their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted, people with this personality type feel
                                  a deep sense of responsibility to those around them. Defenders can be counted on to meet deadlines, remember birthdays and special occasions,
                                  uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do,
                                  preferring instead to operate behind the scenes.
                                  
                                  This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring, Defenders also have excellent
                                  analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships.
                                  Defenders are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                                  Defenders are true altruists, meeting kindness with kindness-in-excess and engaging with the work and people they believe in with enthusiasm and generosity.
                                  
                                  What does ISFJ stands for ?
                                  Among Defenders’ most distinctive traits is loyalty. Rare is the Defender who allows a friendship or relationship to fade away from lack of effort. Instead,
                                  they invest a great deal of energy into maintaining strong connections with their loved ones – and not just by sending “How are you doing?” texts. People with
                                  this personality type are known for dropping everything and lending a hand whenever a friend or family member is going through a hard time.
                                  Defenders tend to feel most energized and effective when they’re showing up for someone who needs their help.
                                  Defenders’ sense of loyalty doesn’t stop with their nearest and dearest – it often extends to their communities, their employers, and even family traditions.
                                  But the intensity of their commitment and desire to serve can have its downsides. Other people may take advantage of Defenders’ helpful, hardworking nature,
                                  leaving them feeling burned out and overworked. And Defenders may feel guilty or stressed when they contemplate changes – even necessary changes – to themselves,
                                  their relationships, or the way they’ve done things in the past.
                                  The Highest of Standards
                                  For Defenders, “good enough” is rarely good enough. People with this personality type can be meticulous to the point of perfectionism. They take their responsibilities
                                  personally, consistently going above and beyond and doing everything that they can to exceed others’ expectations.
                                  Defender personalities are known for their humility, and they rarely seek the spotlight.
                                  
                    """);
        }
        else if(point.equals("ESTJ")){
            System.out.println("""
                                  Executive(16Personalities)
                                  The ESTJ personality type
                                  Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities
                                  together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they
                                  happily lead the way on difficult paths. Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to bring everyone
                                  together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together.
                                  
                                  What does ESTJ stand for?
                                  An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following their own
                                  sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
                                  Demand for such leadership is high in democratic societies, and forming no less than 11% of the population, it’s no wonder that many of America’s presidents have been
                                  Executives. Strong believers in the rule of law and authority that must be earned, Executive personalities lead by example, demonstrating dedication and purposeful honesty,
                                  and an utter rejection of laziness and cheating, especially in work. If anyone declares hard, manual work to be an excellent way to build character, it is Executives.
                                  Executives are aware of their surroundings and live in a world of clear, verifiable facts – the surety of their knowledge means that even against heavy resistance,
                                  they stick to their principles and push an unclouded vision of what is and is not acceptable. Their opinions aren’t just empty talk either, as Executives are more than
                                  willing to dive into the most challenging projects, improving action plans and sorting details along the way, making even the most complicated tasks seem easy and approachable.
                                 
                                  However, Executives don’t work alone, and they expect their reliability and work ethic to be reciprocated – people with this personality type meet their promises, and if partners
                                  or subordinates jeopardize them through incompetence or laziness, or worse still, dishonesty, they do not hesitate to show their wrath. This can earn them a reputation for inflexibility,
                                  a trait shared by all Sentinel personalities, but it’s not because Executives are arbitrarily stubborn, but because they truly believe that these values are what make society work.
                    """);
        }
        else if (point.equals("ESFJ")){
            System.out.println("""
                                   Consul(16Personalities)
                                   The ESFJ personality type
                                   Encourage, lift, and strengthen one another. For the positive energy spread to one will be felt by us all.
                                   DEBORAH DAY
                                   For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends,
                                   loved ones, and neighbors.
                                   This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those
                                   around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together.
                                   Consuls have a talent for making the people in their lives feel supported, cared for, and secure.
                                   
                                   What does ESFJ stands for ?
                                   A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, and they enjoy taking part in their social
                                   community. Their achievements are guided by decisive values, and they willingly offer guidance to others.       
                    
                    """);
        }

//        int numberSensing
//        for (int sensing = 0; sensing < ; sensing++) {
//            for (int intuitive = 0; intuitive < ; intuitive++) {
//
//            }
//
//        }
//        if (response[0][])

    }
    public static void printPersonality(){


    }

}




