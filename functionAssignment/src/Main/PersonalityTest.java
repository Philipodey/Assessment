package Main;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest {
        public static void main(String[] args) {
            String[] questions = new String[]{" expend energy, enjoy groups.", " more outgoing, think out loud.", " seek many tasks, public activities,interaction with others.", " external communicative, express yourself.", " active, initiate", " interpret literally", " practical, realistic, experimental.", " standard, usual, conventional.", " focus on here-and-now.", " facts, things, what is", " logical, thinking, questioning.", " candid, straight forward, frank.", " firm, tend to criticise, hold the line.", " tough-minded, just.", " matter of facts, issue-oriented.", " organised, orderly.", " plan, schedule.", " regulated, structured.", " preparation, plan ahead.", " control, govern."};
            String[] questionB = new String[]{"conserve energy, enjoy one-on-one", "more reserved, think to yourself", "seek private, solitary activities with quiet to concentrate", "internal, reticent, keep to yourself", "reflective, deliberate", "look for meaning and possibilities", "imaginative, innovative, theoretical", "different, novel, unique", "look to the future, global perspective, big picture", "ideas, dreams, what could be, philosophical", "empathetic, feeling, accommodating", "tactful, kind, encouraging", "gentle, tend to appreciate, conciliate", " tender-hearted, merciful", "sensitive, people-oriented, compassionate", "flexible, adaptable", "unplanned, spontaneous", "easy-going, live, and let live", "go with the flow, adapt as you go", "latitude, freedom"};
            answers(questions, questionB);
        }

        public static void answers(String[] array, String[] question) {
            Scanner check = new Scanner(System.in);
            String answer = "";
            String[] answera = new String[]{"E", "S", "T", "J"};
            String[] answersb = new String[]{"I", "N", "F", "P"};
            String[][] answerBank = new String[4][5];
            String point = "";

            int count;
            for(count = 0; count < 5; ++count) {
                System.out.println("A." + array[count] + "\t\tB." + question[count]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a")) {
                    answerBank[0][count] = answer + ". " + array[count];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBank[0][count] = answer + ". " + question[count];
                }

                while(!answer.equals("a") && !answer.equals("b")) {
                    System.out.println(array[count] + "\t\t" + question[count]);
                    answer = check.next();
                    if (answer.equalsIgnoreCase("a")) {
                        answerBank[0][count] = answer + ". " + array[count];
                    } else if (answer.equalsIgnoreCase("b")) {
                        answerBank[0][count] = answer + ". " + question[count];
                    }
                }
            }

            count = 0;

            int judging;
            for(judging = 5; judging < 10; ++judging) {
                System.out.println(array[judging] + "\t\t" + question[judging]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a")|| answer.equalsIgnoreCase("A")) {
                    answerBank[1][count] = answer + ". " + array[judging];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBank[1][count] = answer + ". " + question[judging];
                }

                ++count;

                while(!answer.equals("a") && !answer.equals("b")) {
                    System.out.println(array[judging] + ". \t\t" + question[judging]);
                    answer = check.next();
                    if (answer.equalsIgnoreCase("a")) {
                        answerBank[1][count] = answer + ". " + array[judging];
                    } else if (answer.equalsIgnoreCase("b")) {
                        answerBank[1][count] = answer + ". " + question[judging];
                    }
                }
            }

            count = 0;

            for(judging = 10; judging < 15; ++judging) {
                System.out.println(array[judging] + "\t\t" + question[judging]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a")) {
                    answerBank[2][count] = answer + ". " + array[judging];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBank[2][count] = answer + ". " + question[judging];
                }

                ++count;

                while(!answer.equals("a") && !answer.equals("b")) {
                    System.out.println(array[judging] + "\t\t" + question[judging]);
                    answer = check.nextLine();
                    if (answer.equalsIgnoreCase("a")) {
                        answerBank[2][count] = answer + ". " + array[judging];
                    } else if (answer.equalsIgnoreCase("b")) {
                        answerBank[2][count] = answer + ". " + question[judging];
                    }
                }
            }

            count = 0;

            for(judging = 15; judging < 20; ++judging) {
                System.out.println(array[judging] + "\t\t" + question[judging]);
                answer = check.next();
                if (answer.equalsIgnoreCase("a")) {
                    answerBank[3][count] = answer + ". " + array[judging];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBank[3][count] = answer + ". " + question[judging];
                }

                ++count;

                while(!answer.equals("a") && !answer.equals("b")) {
                    System.out.println(array[judging] + "\t\t" + question[judging]);
                    answer = check.next();
                    if (answer.equalsIgnoreCase("a")) {
                        answerBank[3][count] = answer + ". " + array[judging];
                    } else if (answer.equalsIgnoreCase("b")) {
                        answerBank[3][count] = answer + ". " + question[judging];
                    }
                }
            }

            System.out.println(Arrays.deepToString(answerBank));
            judging = 0;
            int numberIntrovert = 0;


            for(int i = 0; i < answerBank.length; ++i) {
                for(int j = 0; j < answerBank[i].length; ++j) {
                    String response = answerBank[i][j];
                    System.out.println(response);
                    if (response.startsWith("a")) {
                        ++judging;
                    } else {
                        ++numberIntrovert;
                    }
                }

                if (judging > numberIntrovert) {
                    point = point + answera[i];
                } else {
                    point = point + answersb[i];
                }

                System.out.println("Number of A is " + judging);
                System.out.println("Number of B is " + numberIntrovert);
                System.out.println();
                System.out.println(point);
                judging = 0;
                numberIntrovert = 0;
                System.out.println();
            }

            if (point.equals("ESTP")) {
                System.out.println("              Entrepreneurs(16Personalities)\n              The ESTP Personality Type\n              Entrepreneurs always have an impact on their immediate surroundings – the best way to\n              spot them at a party is to look for the whirling eddy of people flitting about them as\n              they move from group to group. Laughing and entertaining with a blunt and earthy humor,\n              Entrepreneur personalities love to be the center of attention. If an audience member is\n              asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.\n              What does ESTP stand for?\n              Entrepreneurs are the likeliest personality type to make a lifestyle of risky behavior.\n              They live in the moment and dive into the action – they are the eye of the storm.\n              People with the Entrepreneur personality type enjoy drama, passion, and pleasure,\n              not for emotional thrills, but because it’s so stimulating to their logical minds.\n              They are forced to make critical decisions based on factual, immediate reality in\n              a process of rapid-fire rational stimulus response.\n");
            } else if (point.equals("INFJ")) {
                System.out.println("              Advocates(16Personalities)\n              The INFJ personality Type\n              Advocates (INFJs) may be the rarest personality type of all, but they certainly leave\n              their mark on the world. Idealistic and principled, they aren’t content to coast through\n              life – they want to stand up and make a difference. For Advocate personalities, success\n              does not come from money or status but from seeking fulfillment, helping others,\n              and being a force for good in the world.\n              While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers.\n              People with this personality type care about integrity, and they’re rarely satisfied until\n              they’ve done what they know to be right. Conscientious to the core, they move through life\n              with a clear sense of their values, and they aim never to lose sight of what truly matters – not\n              according to other people or society at large, but according to their own wisdom and intuition.\n\n              What does INFJ stands for ?\n               Perhaps because their personality type is so uncommon, Advocates tend to carry around a sense –\n               whether conscious or not – of being different from most people. With their rich inner lives and\n               their deep, abiding desire to find their life purpose, they don’t always fit in with those around them.\n               This isn’t to say that Advocates can’t enjoy social acceptance or close relationships – only that they\n               sometimes feel misunderstood or at odds with the world.\n               Fortunately, this sense of being out of step doesn’t diminish Advocates’ commitment to making\n               the world a better place. Advocates are troubled by injustice, and they typically care more\n               about altruism than personal gain. They often feel called to use their strengths – including\n               creativity, imagination, and sensitivity – to uplift others and spread compassion.\n\n");
            } else if (point.equals("INFP")) {
                System.out.println("              Mediator(16Personalities)\n              The INFP personality type\n              Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives.\n              Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories\n              and conversations in their minds. These personalities are known for their sensitivity – Mediators\n              can have profound emotional responses to music, art, nature, and the people around them.\n              Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others.\n              But because this personality type makes up such a small portion of the population, Mediators may sometimes feel\n              lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.\n              All that is gold does not glitter; not all those who wander are lost; the old that is strong does not wither;\n              deep roots are not reached by the frost.\n\n              What does INFP stands for ?\n              Mediators share a sincere curiosity about the depths of human nature. Introspective to the core, they’re exquisitely\n              attuned to their own thoughts and feelings, but they yearn to understand the people around them as well. Mediators\n              are compassionate and nonjudgmental, always willing to hear another person’s story. When someone opens up to them\n              or turns to them for comfort, they feel honored to listen and be of help.\n              Empathy is among this personality type’s greatest gifts, but at times it can be a liability. The troubles of the\n              world weigh heavily on Mediators’ shoulders, and these personalities can be vulnerable to internalizing other\n              people’s negative moods or mindsets. Unless they learn to set boundaries, Mediators may feel overwhelmed by\n              just how many wrongs there are that need to be set right.\n");
            } else if (point.equals("ENFJ")) {
                System.out.println("              Protagonist(16Personalities)\n              The ENFJ personality type\n              Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic, these personality\n              types strive to have a positive impact on other people and the world around them. They rarely shy away from an opportunity\n              to do the right thing, even when doing so is far from easy.\n              Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches,\n              and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their\n              lives, including their relationships. Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends\n              and loved ones to grow into their best selves.\n\n              What does ENFJ stands for ?\n              Protagonists tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust\n              or wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak\n              in ways that resonate with others.\n              These personality types have an uncanny ability to pick up on people’s underlying motivations and beliefs.\n              At times, they may not even understand how they come to grasp another person’s mind and heart so quickly.\n              These flashes of insight can make Protagonists incredibly persuasive and inspiring communicators.\n              Protagonists’ secret weapon is their purity of intent. Generally speaking, they are motivated by a sincere\n              wish to do the right thing rather than a desire to manipulate or have power over other people. Even when they disagree with\n              someone, Protagonists search for common ground. The result is that people with this personality type can communicate with an\n              eloquence and sensitivity that are nearly impossible to ignore – particularly when they speak about matters that are close\n              to their hearts.\n");
            } else if (point.equals("ENFP")) {
                System.out.println("              Campaigners(16Personalities)\n              The ENFP personality type\n              Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life,\n              they stand out in any crowd. But even though they can be the life of the party, Campaigners don’t just care about having a good\n              time. These personality types run deep – as does their longing for meaningful, emotional connections with other people.\n              Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives. But beneath their sociable,\n              easygoing exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity,\n              a Campaigner simply wouldn’t be a Campaigner.\n              In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life\n              – even when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected,\n              and they live for the glimmers of insight that they can gain into these connections.\n\n              What does ENFP stands for ?\n              Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives. But beneath their sociable, easygoing\n              exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity, a Campaigner simply\n              wouldn’t be a Campaigner.\n              In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life – even\n              when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected, and they\n              live for the glimmers of insight that they can gain into these connections.\n");
            } else if (point.equals("ISTJ")) {
                System.out.println("              Logisticians(16Personalities)\n              The ISTJ personality type\n              Logisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something,\n              they make sure to follow through. This personality type makes up a good portion of the overall population, and while logisticians may not be\n              particularly flashy or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation. In their families and\n              their communities, Logisticians often earn respect for their reliability, their practicality, and their ability to stay grounded and logical,\n              even in the most stressful situations.\n\n              What does ISTJ stands for ?\n              The core of Logisticians’ self-respect comes from a sense of personal integrity. People with this personality type believe that there is a right\n              way to proceed in any situation – and that anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes.\n              Logisticians have a deep respect for structure and tradition, and they are often drawn to organizations, workplaces, and educational settings\n              that offer clear hierarchies and expectations.\n\n              For many Logisticians, a lack of structure offers not freedom, but chaos.\n              People with the Logistician personality type rarely hesitate to take responsibility for their actions and choices. Generally speaking, they\n              are quick to own up to their own mistakes, admitting the truth even if it doesn’t make them look good. To Logisticians, honesty is far more\n              important than showmanship, and they’d rather satisfy their own conscience than lie to impress someone else.\n");
            } else if (point.equals("ISFJ")) {
                System.out.println("              Defender(16Personalities)\n              The ISFJ personality type\n              In their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted, people with this personality type feel\n              a deep sense of responsibility to those around them. Defenders can be counted on to meet deadlines, remember birthdays and special occasions,\n              uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do,\n              preferring instead to operate behind the scenes.\n\n              This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring, Defenders also have excellent\n              analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships.\n              Defenders are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.\n              Defenders are true altruists, meeting kindness with kindness-in-excess and engaging with the work and people they believe in with enthusiasm and generosity.\n\n              What does ISFJ stands for ?\n              Among Defenders’ most distinctive traits is loyalty. Rare is the Defender who allows a friendship or relationship to fade away from lack of effort. Instead,\n              they invest a great deal of energy into maintaining strong connections with their loved ones – and not just by sending “How are you doing?” texts. People with\n              this personality type are known for dropping everything and lending a hand whenever a friend or family member is going through a hard time.\n              Defenders tend to feel most energized and effective when they’re showing up for someone who needs their help.\n              Defenders’ sense of loyalty doesn’t stop with their nearest and dearest – it often extends to their communities, their employers, and even family traditions.\n              But the intensity of their commitment and desire to serve can have its downsides. Other people may take advantage of Defenders’ helpful, hardworking nature,\n              leaving them feeling burned out and overworked. And Defenders may feel guilty or stressed when they contemplate changes – even necessary changes – to themselves,\n              their relationships, or the way they’ve done things in the past.\n              The Highest of Standards\n              For Defenders, “good enough” is rarely good enough. People with this personality type can be meticulous to the point of perfectionism. They take their responsibilities\n              personally, consistently going above and beyond and doing everything that they can to exceed others’ expectations.\n              Defender personalities are known for their humility, and they rarely seek the spotlight.\n\n");
            } else if (point.equals("ESTJ")) {
                System.out.println("              Executive(16Personalities)\n              The ESTJ personality type\n              Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities\n              together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they\n              happily lead the way on difficult paths. Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to bring everyone\n              together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together.\n\n              What does ESTJ stand for?\n              An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following their own\n              sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.\n              Demand for such leadership is high in democratic societies, and forming no less than 11% of the population, it’s no wonder that many of America’s presidents have been\n              Executives. Strong believers in the rule of law and authority that must be earned, Executive personalities lead by example, demonstrating dedication and purposeful honesty,\n              and an utter rejection of laziness and cheating, especially in work. If anyone declares hard, manual work to be an excellent way to build character, it is Executives.\n              Executives are aware of their surroundings and live in a world of clear, verifiable facts – the surety of their knowledge means that even against heavy resistance,\n              they stick to their principles and push an unclouded vision of what is and is not acceptable. Their opinions aren’t just empty talk either, as Executives are more than\n              willing to dive into the most challenging projects, improving action plans and sorting details along the way, making even the most complicated tasks seem easy and approachable.\n\n              However, Executives don’t work alone, and they expect their reliability and work ethic to be reciprocated – people with this personality type meet their promises, and if partners\n              or subordinates jeopardize them through incompetence or laziness, or worse still, dishonesty, they do not hesitate to show their wrath. This can earn them a reputation for inflexibility,\n              a trait shared by all Sentinel personalities, but it’s not because Executives are arbitrarily stubborn, but because they truly believe that these values are what make society work.\n");
            } else if (point.equals("ESFJ")) {
                System.out.println("               Consul(16Personalities)\n               The ESFJ personality type\n               Encourage, lift, and strengthen one another. For the positive energy spread to one will be felt by us all.\n               DEBORAH DAY\n               For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends,\n               loved ones, and neighbors.\n               This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those\n               around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together.\n               Consuls have a talent for making the people in their lives feel supported, cared for, and secure.\n\n               What does ESFJ stands for ?\n               A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, and they enjoy taking part in their social\n               community. Their achievements are guided by decisive values, and they willingly offer guidance to others.\n\n");
            }

        }

        public static void printPersonality() {
        }
    }


