package hu.progmatic.szolanc;

import java.util.*;

public class WordGame {

    private Map<String, Set<String>> words;
    private Set<String> usedWords;

    // constructor(s)

    // main()

    // other methods

    public static void main(String[] args) {

        WordGame game = new WordGame();
        game.values();
        game.addWords();


    }

    public void values() {
        words = new HashMap<>();
        usedWords = new HashSet<>();
    }

    /*public String sayAWord(String lastWord) {

        String beginWith = lastChar(lastWord);

        String wordToSay;
        boolean canSay;

        do {

            wordToSay = chooseWord(beginWith);



        } while (!canSay);

        return wordToSay;
    }*/

    public void addWords() {
        words.put("a" , new HashSet<>(Arrays.asList("alma", "arisztokrata", "apad", "agy", "alattomos", "ara", "albérlet", "avar", "avatás", "alkony", "alkonyat", "az")));
        words.put("á", new HashSet<>(Arrays.asList("álom", "ágy", "álmos", "ábránd", "ábrándozik", "ág", "árva", "ál", "áll", "álca", "ágyas", "átlát")));
        words.put("b" , new HashSet<>(Arrays.asList("barack", "becsület", "becsül", "banán", "béke", "béka", "berek", "büdös", "bot", "buzogány", "berreg", "bekerít")));
        words.put("c" , new HashSet<>(Arrays.asList("cica", "cigaretta", "cél", "cicoma", "ciripel", "cékla", "ceruza", "cincog", "cinege", "comb", "copf", "cápa")));
        words.put("cs", new HashSet<>(Arrays.asList("csiga", "csont", "csepp", "csöpög", "cseppent", "csépel", "csalogány", "csúf", "csúfol", "csemege", "csel", "csal")));
        words.put("d" , new HashSet<>(Arrays.asList("dió", "dicsér", "dicséret", "dicséretes", "dagály", "dal", "dalol", "darázs", "de", "drót", "deciméter", "deciliter")));
        words.put("e" , new HashSet<>(Arrays.asList("egér", "epe", "elmegy", "elenyészik", "elenyésző", "egy", "ezer", "emel", "emelő", "elem", "emleget", "emlék")));
        words.put("é" , new HashSet<>(Arrays.asList("ég", "égő", "éber", "ébred", "ébredezik", "ébredező", "ébresztő", "él", "élet", "éltet", "éltető", "éleszt")));
        words.put("f" , new HashSet<>(Arrays.asList("fa", "fürge", "fesztelen", "fázik", "fél", "félénk", "fanyar", "fenyő", "fos", "frizura", "fánk", "felemel")));
        words.put("g" , new HashSet<>(Arrays.asList("galamb", "galagonya", "gúny", "gúnyol", "gurul", "gizda", "gereblye", "gép", "gól", "gömbölyű", "garas", "gáz")));
        words.put("gy" , new HashSet<>(Arrays.asList("gyökér", "gyarló", "gyenge", "gyep", "gyönyörű", "gyám", "gyámolít", "gyík", "gyom", "gyomlál", "gyanta", "gyanakszik")));
        words.put("h" , new HashSet<>(Arrays.asList("híd", "hős", "hősies", "hősiesség", "hát", "harc", "hanem", "ha", "hal", "hód", "háló", "halló")));
        words.put("i" , new HashSet<>(Arrays.asList("ibolya", "idom", "idomár", "irodalom", "inga", "ingóság", "ideg", "idegen", "iga", "ideges", "izzad", "izzadság")));
        words.put("í", new HashSet<>(Arrays.asList("íj", "ír", "íz", "ízlel", "ízelő", "ízbimbó", "ím", "író", "ízetlen", "így", "íny", "írógép")));
        words.put("j" , new HashSet<>(Arrays.asList("jó", "jóga", "jég", "jeges", "jár", "járkál", "józan", "józanodik", "jel", "jeles", "jelöl", "jegenye")));
        words.put("k" , new HashSet<>(Arrays.asList("kakas", "kifli", "kenyér", "kóbor", "kaland", "kalandos", "konok", "kevés", "kenguru", "kerget", "kerít", "kér")));
        words.put("l" , new HashSet<>(Arrays.asList("liba", "liga", "letesz", "lék", "lavor", "leng", "lát", "lét", "lány", "lény", "levél", "lé")));
        words.put("ly" , new HashSet<>(Arrays.asList("lyuk", "lyukaszt", "lyukas", "lyukad", "lyukadt", "lyukasztó", "lyukasztott")));
        words.put("m" , new HashSet<>(Arrays.asList("mogyoró", "mancs", "mag", "magol", "molylepke", "makacs", "mardos", "magolás", "mászik", "mászás", "meleg", "melegít")));
        words.put("n" , new HashSet<>(Arrays.asList("nád", "naiv", "nóta", "nagy", "nagyít", "nagyítás", "negédes", "nesze", "nesz", "nagymama", "nagypapa", "nádor")));
        words.put("ny" , new HashSet<>(Arrays.asList("nyest", "nyúl", "nyuszi", "nyámnyila", "nyíl", "nyál", "nyálas", "nyáladzik", "nyom", "nyomaték", "nyomoz", "nyomozó")));
        words.put("o" , new HashSet<>(Arrays.asList("ovális", "olló", "okker", "ok", "okoz", "okozat", "okság", "okos", "okosság", "omlik", "omladozik", "orr")));
        words.put("ó" , new HashSet<>(Arrays.asList("óvoda", "ólom", "ól", "ódivatú", "ózon", "ózonréteg", "óvatos", "óvakodik", "óbégat", "ókor", "óra", "óceán")));
        words.put("ö" , new HashSet<>(Arrays.asList("öreg", "öltöny", "öltözik", "öltözet", "ösztöke", "öntelt", "önérzet", "ösztökél", "ön", "önző", "ömleng", "ömlik")));
        words.put("ő" , new HashSet<>(Arrays.asList("ős", "ősi", "ősz", "őz", "őriz", "őrizget", "őrző", "őszies", "őszül", "őr", "őszibarack", "őszi")));
        words.put("p" , new HashSet<>(Arrays.asList("pipa", "papa", "pap", "paplan", "parlag", "penge", "para", "penész", "pénz", "pénzes", "pénzéhes", "pisze")));
        words.put("r" , new HashSet<>(Arrays.asList("rég", "repül", "repülő", "repülőgép", "régi", "régies", "régóta", "ront", "rontás", "rebellis", "roham", "ribizli")));
        words.put("s" , new HashSet<>(Arrays.asList("sas", "sorozat", "sólyom", "sovány", "sok", "sokall", "sík", "síkidom", "sakk", "selyem", "selymes", "süvölt")));
        words.put("sz" , new HashSet<>(Arrays.asList("szántó", "szánt", "szánalom", "szánalmas", "szaft", "szép", "szelíd", "szent", "szende", "szív", "szívélyes", "szívélyesen")));
        words.put("t" , new HashSet<>(Arrays.asList("tészta", "test", "testvér", "taliga", "tojás", "tuja", "tető", "telefon", "tömeg", "tömérdek", "tele", "tégla")));
        words.put("ty" , new HashSet<>(Arrays.asList("tyúk", "tyúkszem", "tyúkper")));
        words.put("u" , new HashSet<>(Arrays.asList("udvar", "utazás", "utazik", "ujj", "udvarol", "udvarias", "ugar", "ugrik", "ugrás", "után", "utánoz", "utánzat")));
        words.put("ú" , new HashSet<>(Arrays.asList("úr", "úszik", "úsztat", "új", "újít", "újítás", "út", "úti", "útitárs", "úrhölgy")));
        words.put("ü" , new HashSet<>(Arrays.asList("üveg", "üteg", "üzlet", "üzleties", "ürge", "üzen", "üzenet", "üldöz", "üldözés", "ütköz", "ütközet", "üvölt")));
        words.put("ű" , new HashSet<>(Arrays.asList("űr", "űz", "űzés", "űrszonda", "űrhajó", "űrszemét", "űrutazás", "űrlap", "űrlény")));
        words.put("v" , new HashSet<>(Arrays.asList("vézna", "vigasz", "vallás", "vákuum", "vak", "vakság", "vaksi", "vakondok", "vőlegény", "vár", "vér", "ver")));
        words.put("z" , new HashSet<>(Arrays.asList("zokni", "zebra", "zihál", "zord", "zeke", "zigóta", "zár", "zárt", "zaj", "zajos", "zeller", "zabolátlat")));
        words.put("zs" , new HashSet<>(Arrays.asList("zseb", "zsúr", "zsindely", "zsák", "zsákol", "zsarol", "zsarolás", "zsaroló", "zsugori", "zsineg", "zsinór", "zsömle")));
    }

    public String lastChar(String lastWord) {

        if (lastWord.length() < 2) {
            return lastWord;
        }

        String lastChar = String.valueOf(lastWord.charAt(lastWord.length() - 1));
        String toCheck = String.valueOf(lastWord.charAt(lastWord.length() - 2));

         if (lastChar.equals("y") ||
                 lastChar.equals("s") && toCheck.equals("c") || toCheck.equals("z") ||
                 lastChar.equals("z") && toCheck.equals("s")) {
             return toCheck + lastChar;
         } else {
             return lastChar;
         }
    }

    public String chooseWord(String charToBegintWith) {

        int random = (int) (Math.random() * words.get(charToBegintWith).size());
        int index = 0;
        String choosenOne = "";

        for (String word : words.get(charToBegintWith)) {
            if (random == index) {
                return word;
            }
            index++;
        }

        /*for (String word : words.get(charToBegintWith)) {
            return word;
        }*/

        return null;
    }

    public String riaChoseWord(String charToBegintWith) {

        for (String word : words.get(charToBegintWith)) {
            return word;
        }

        return null;
    }

    public boolean compareWord(String word) {

        return !usedWords.contains(word);

    }

}
