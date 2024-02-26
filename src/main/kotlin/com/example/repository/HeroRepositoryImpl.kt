package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"
class HereRepositoryImpl: HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Jose Rizal",
            image = "/images/rizal.jpg",
            about = "José Protacio Rizal Mercado y Alonzo Realonda (June 19, 1861 – December 30, 1896) was a Filipino nationalist, writer, and revolutionary. He is widely considered one of the greatest heroes of the Philippines. He was a prolific poet, essayist, diarist, correspondent, and novelist whose most famous works include Noli Me Tangere and El Filibusterismo.",
            rating = 5.0,
            power = 98,
            month = "June",
            day = "19th",
            family = listOf(
                "Francisco Mercado",
                "Teodora Alonso",
                "Paciano Rizal"
            ),
            abilities = listOf(
                "Writing",
                "Intellect",
                "Activism",
                "Medical Practice"
            ),
            natureTypes = listOf(
                "Wisdom",
                "Courage",
                "Leadership"
            )
        ),
        Hero(
            id = 2,
            name = "Andres Bonifacio",
            image = "/images/bonifacio.jpg",
            about = "Andrés Bonifacio y de Castro (November 30, 1863 – May 10, 1897) was a Filipino revolutionary leader and the president of the Tagalog Republic. He is often called \"The Father of the Philippine Revolution.\" Bonifacio was a founder and later Supremo (Supreme Leader) of the Katipunan movement, which sought the independence of the Philippines from Spanish colonial rule.",
            rating = 5.0,
            power = 98,
            month = "Nov",
            day = "30th",
            family = listOf(
                "Catalina de Castro",
                "Santiago Bonifacio",
                "Procopio Bonifacio",
                "Ciriaco Bonifacio"
            ),
            abilities = listOf(
                "Leadership",
                "Revolutionary Tactics",
                "Bravery",
                "Organization"
            ),
            natureTypes = listOf(
                "Courage",
                "Strength",
                "Vision"
            )
        ),
        Hero(
            id = 3,
            name = "Melchora Aquino",
            image = "/images/aquino.jpg",
            about = "Melchora Aquino de Ramos (January 6, 1812 – March 2, 1919), commonly known as Tandang Sora, was a Filipina revolutionary who supported the Katipunan and its aims during the Philippine Revolution. She is remembered as the \"Mother of the Philippine Revolution\" and the \"Grand Woman of the Revolution.\" She provided food, shelter, and care to the Katipunan members and wounded Katipuneros.",
            rating = 4.5,
            power = 92,
            month = "Jan",
            day = "6th",
            family = listOf("No Record"),
            abilities = listOf(
                "Nurturing",
                "Courage",
                "Philanthropy",
                "Resistance"
            ),
            natureTypes = listOf(
                "Compassion",
                "Courage",
                "Resilience"
            )
        )
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Gabriela Silang",
            image = "/images/silang.jpg",
            about = "Gabriela Silang (January 19, 1751 – September 20, 1753) was a Filipina revolutionary leader who is recognized as a national heroine of the Philippines. She led a revolt against Spanish colonial rule in Ilocos together with her husband, Diego Silang, after his death.",
            rating = 4.8,
            power = 95,
            month = "Jan",
            day = "19th",
            family = listOf(
                "Diego Silang"
            ),
            abilities = listOf(
                "Leadership",
                "Military Strategy",
                "Courage",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Courage",
                "Determination",
                "Resilience"
            )
        ),
        Hero(
            id = 5,
            name = "Apolinario Mabini",
            image = "/images/mabini.jpg",
            about = "Apolinario Mabini y Pineda (July 23, 1864 – May 13, 1901) was a Filipino politician, jurist, and revolutionary. He is also known as \"The Brains of the Revolution\" due to his role in drafting the Constitution of the Malolos Republic, the first Philippine republic.",
            rating = 4.7,
            power = 90,
            month = "July",
            day = "23rd",
            family = listOf(
                "Inocencio Mabini",
                "Trinidad Pineda"
            ),
            abilities = listOf(
                "Law",
                "Writing",
                "Political Strategy",
                "Leadership"
            ),
            natureTypes = listOf(
                "Wisdom",
                "Intellect",
                "Patriotism"
            )
        ),
        Hero(
            id = 6,
            name = "Sultan Kudarat",
            image = "/images/kudarat.jpg",
            about = "Sultan Kudarat (1580 – 1648) was a Maguindanao Sultan who fiercely resisted Spanish colonization in the southern Philippines. He is known for his military prowess and strategic leadership in numerous battles against the Spanish forces.",
            rating = 4.9,
            power = 97,
            month = "",
            day = "",
            family = listOf("No Record"),
            abilities = listOf(
                "Military Strategy",
                "Leadership",
                "Diplomacy",
                "Resistance"
            ),
            natureTypes = listOf(
                "Courage",
                "Strength",
                "Patriotism"
            )
        )
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Lapu-Lapu",
            image = "/images/lapu-lapu.jpg",
            about = "Lapu-Lapu (c. 1491 – April 27, 1542) was a chieftain of Mactan, an island in the Visayas region of the Philippines. He is most famous for leading the indigenous Cebuano warriors in the Battle of Mactan, where they defeated a Spanish expedition led by Portuguese explorer Ferdinand Magellan on April 27, 1542.",
            rating = 5.0,
            power = 98,
            month = "April",
            day = "27th",
            family = listOf("No Record"),
            abilities = listOf(
                "Leadership",
                "Military Strategy",
                "Courage",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Courage",
                "Strength",
                "Leadership"
            )
        ),
        Hero(
            id = 8,
            name = "Gregorio del Pilar",
            image = "/images/delpilar.jpg",
            about = "Gregorio del Pilar y Nakpil (November 14, 1868 – December 2, 1899) was a Filipino military leader during the Philippine Revolution and the Philippine–American War. He is known for his heroism in the Battle of Tirad Pass, where he led a small force of Filipino soldiers against a much larger American force.",
            rating = 4.9,
            power = 96,
            month = "Nov",
            day = "14th",
            family = listOf(
                "Fernando del Pilar",
                "Theodora Nakpil"
            ),
            abilities = listOf(
                "Military Strategy",
                "Leadership",
                "Courage",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Courage",
                "Leadership",
                "Sacrifice"
            )
        ),
        Hero(
            id = 9,
            name = "Manuel Quezon",
            image = "/images/quezon.jpg",
            about = "Manuel L. Quezon (August 19, 1878 – August 1, 1944) was a Filipino statesman, soldier, and politician who served as president of the Commonwealth of the Philippines from 1935 to 1944. He was the first Filipino to head a government of the entire Philippines (as opposed to the government of previous Philippine states), and is considered to have been the second president of the Philippines, after Emilio Aguinaldo (1899–1901).",
            rating = 4.7,
            power = 95,
            month = "August",
            day = "19th",
            family = listOf(
                "Avelina Guerrero",
                "Maria Dolores Molina"
            ),
            abilities = listOf(
                "Leadership",
                "Statesmanship",
                "Nation-building",
                "Diplomacy"
            ),
            natureTypes = listOf(
                "Vision",
                "Unity",
                "Progress"
            )
        )

    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "Juan Luna",
            image = "/images/luna.jpg",  // Update image path if needed
            about = "Juan Luna de San Pedro y Novicio Ancheta (October 23, 1857 – December 7, 1899) was a Filipino painter, sculptor and a political activist of the Philippine Revolution during the late 19th century. He became one of the first recognized Philippine artists. He is known for his historical and allegorical paintings, many of which depicted the struggles of the Filipino people against Spanish colonial rule.",
            rating = 4.8,
            power = 94,
            month = "Oct",
            day = "23rd",
            family = listOf(
                "Joaquin Luna de San Pedro y Posadas",
                "Laureana Novicio y Ancheta"
            ),
            abilities = listOf(
                "Painting",
                "Sculpture",
                "Activism",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Creativity",
                "Passion",
                "Patriotism"
            )
        ),
        Hero(
            id = 11,
            name = "Diego Silang",
            image = "/images/dsilang.jpg",
            about = "Diego Silang y y Expectación (November 16, 1733 – September 20, 1753) was a Filipino revolutionary leader who led an uprising against Spanish colonial rule in Ilocos together with his wife, Gabriela Silang. He is considered a national hero of the Philippines.",
            rating = 4.8,
            power = 95,
            month = "Nov",
            day = "16th",
            family = listOf("No Record"),
            abilities = listOf(
                "Leadership",
                "Military Strategy",
                "Patriotism",
                "Courage"
            ),
            natureTypes = listOf(
                "Courage",
                "Determination",
                "Patriotism"
            )
        ),
        Hero(
            id = 12,
            name = "Emilio Jacinto",
            image = "/images/jacinto.jpg",
            about = "Emilio Jacinto y Dizon (March 22, 1875 – February 16, 1899) was a Filipino revolutionary and writer, known as the \"Brains of the Katipunan\" due to his intellectual contributions to the Philippine Revolution. He was the secretary-general of the Katipunan, a secret society that fought for Philippine independence from Spain.",
            rating = 4.7,
            power = 92,
            month = "March",
            day = "22nd",
            family = listOf(
                "Emilio Jacinto Sr.",
                "Josefina Dizon"
            ),
            abilities = listOf(
                "Writing",
                "Leadership",
                "Organization",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Wisdom",
                "Intellect",
                "Patriotism"
            )
        )
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "Antonio Luna",
            image = "/images/aluna.jpg",
            about = "Antonio Luna y Novicio (October 29, 1866 – June 5, 1899) was a Filipino military leader and pharmacist who played a key role in the Philippine Revolution. He is known for his military prowess and his strict disciplinarian approach, which earned him the respect of his soldiers.",
            rating = 4.9,
            power = 97,
            month = "Oct",
            day = "29th",
            family = listOf(
                "Joaquin Luna",
                "Laureana Novicio"
            ),
            abilities = listOf(
                "Military Strategy",
                "Leadership",
                "Tactics",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Courage",
                "Strength",
                "Determination"
            )
        ),
        Hero(
            id = 14,
            name = "Marcelo H. del Pilar",
            image = "/images/mdelpilar.jpg",
            about = "Marcelo Hilario del Pilar y Gatmaitan (August 30, 1850 – December 4, 1896) was a Filipino propagandist, writer, and lawyer who played a key role in the Philippine Revolution. He is known for his writings that exposed the abuses of the Spanish colonial government and advocated for Philippine independence.",
            rating = 4.8,
            power = 93,
            month = "Aug",
            day = "30th",
            family = listOf(
                "Julian del Pilar",
                "Bernarda Gatmaitan"
            ),
            abilities = listOf(
                "Writing",
                "Activism",
                "Propaganda",
                "Patriotism"
            ),
            natureTypes = listOf(
                "Wisdom",
                "Courage",
                "Determination"
            )
        ),
        Hero(
            id = 15,
            name = "Emilio Aguinaldo",
            image = "/images/aguinaldo.jpg",
            about = "Emilio Aguinaldo y Famy (March 22, 1869 – February 6, 1964) was a Filipino revolutionary leader and politician who served as the first President of the Philippines (1899–1901) during the Philippine Revolution and the Philippine–American War.",
            rating = 4.7,
            power = 94,
            month = "March",
            day = "22nd",
            family = listOf(
                "Carlos Aguinaldo y Jaminez",
                "Trinidad Famy y Aguinaldo"
            ),
            abilities = listOf(
                "Leadership",
                "Military Strategy",
                "Diplomacy",
                "Politics"
            ),
            natureTypes = listOf(
                "Courage",
                "Determination",
                "Patriotism"
            )
        )
    )

    override suspend fun getAllHerores(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?>{
        var prevPage: Int? = page
        var nextPage: Int? = page

        if(page in 1..4){
            nextPage = nextPage?.plus(1)
        }

        if(page in 2..5){
            prevPage = prevPage?.minus(1)
        }
        if(page == 1){
            prevPage = null
        }

        if(page == 5){
            nextPage = null
        }

        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)
        )
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if(!query.isNullOrEmpty()){
            heroes.forEach { (_, heroesList) ->
                heroesList.forEach { hero ->
                    if(hero.name.lowercase().contains(query.lowercase())){
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}