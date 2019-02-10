import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.BufferedReader
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

private val CSV_HEADER = "CA Ordinateurs, CA Téléphones, CA Tablettes, CA Autre, Panier moyen,Coût par clic, Taux de clic, ROI"

fun main() {
    var fileReader: BufferedReader? = null
    var csvParser: CSVParser? = null
    val round = DecimalFormat("#.##")

    try {
        fileReader = BufferedReader(FileReader("src/main/resources/data.csv"))
        csvParser = CSVParser(fileReader,
            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim().withDelimiter(';'))

        val myList = ArrayList<CSVDATA>()
        val csvRecords = csvParser.getRecords()

        for (csvRecord in csvRecords) {
            val data = CSVDATA(
                csvRecord.get("Annee"),
                csvRecord.get("Appareil"),
                NumberFormat.getNumberInstance(Locale.FRANCE).parse(csvRecord.get("Commandes")),
                Integer.parseInt(csvRecord.get("Impressions")),
                Integer.parseInt(csvRecord.get("Clics")),
                NumberFormat.getNumberInstance(Locale.FRANCE).parse(csvRecord.get("Cout")),
                NumberFormat.getNumberInstance(Locale.FRANCE).parse(csvRecord.get("CA")),
                csvRecord.get("Mois")
            )

            myList.add(data)
        }


        // Chiffre d'affaire par mois et par année

        var caJanvier16Temp = 0.0
        var caFevrier16Temp = 0.0
        var caMars16Temp = 0.0
        var caAvril16Temp = 0.0
        var caMai16Temp = 0.0
        var caJuin16Temp = 0.0
        var caJuillet16Temp = 0.0
        var caAout16Temp = 0.0
        var caSeptembre16Temp = 0.0
        var caOctobre16Temp = 0.0
        var caNovembre16Temp = 0.0
        var caDecembre16Temp = 0.0

        for (data in myList) {
            if (data.annee == "2016") {
                when (data.mois) {
                    "janvier" -> caJanvier16Temp += data.ca.toFloat()
                    "février" -> caFevrier16Temp += data.ca.toFloat()
                    "mars" -> caMars16Temp += data.ca.toFloat()
                    "avril" -> caAvril16Temp += data.ca.toFloat()
                    "mai" -> caMai16Temp += data.ca.toFloat()
                    "juin" -> caJuin16Temp += data.ca.toFloat()
                    "juillet" -> caJuillet16Temp += data.ca.toFloat()
                    "aout" -> caAout16Temp += data.ca.toFloat()
                    "septembre" -> caSeptembre16Temp += data.ca.toFloat()
                    "octobre" -> caOctobre16Temp += data.ca.toFloat()
                    "novembre" -> caNovembre16Temp += data.ca.toFloat()
                    "decembre" -> caDecembre16Temp += data.ca.toFloat()
                }
            }
        }


        val caJanvier16 = round.format(caJanvier16Temp).toFloat()
        val caFevrier16 = round.format(caFevrier16Temp).toFloat()
        val caMars16 = round.format(caMars16Temp).toFloat()
        val caAvril16 = round.format(caAvril16Temp).toFloat()
        val caMai16 = round.format(caMai16Temp).toFloat()
        val caJuin16 = round.format(caJuin16Temp).toFloat()
        val caJuillet16 = round.format(caJuillet16Temp).toFloat()
        val caAout16 = round.format(caAout16Temp).toFloat()
        val caSeptembre16 = round.format(caSeptembre16Temp).toFloat()
        val caOctobre16 = round.format(caOctobre16Temp).toFloat()
        val caNovembre16 = round.format(caNovembre16Temp).toFloat()
        val caDecembre16 = round.format(caDecembre16Temp).toFloat()

        println("-------------- Chiffre d'affaire en 2016 ---------------")

        println("le chiffre d'affaire en Janvier 2016 est de " + caJanvier16 + " €")
        println("le chiffre d'affaire en Fevrier 2016 est de " + caFevrier16 + " €")
        println("le chiffre d'affaire en Mars 2016 est de " + caMars16 + " €")
        println("le chiffre d'affaire en Avril 2016 est de " + caAvril16 + " €")
        println("le chiffre d'affaire en Mai 2016 est de " + caMai16 + " €")
        println("le chiffre d'affaire en Juin 2016 est de " + caJuin16 + " €")
        println("le chiffre d'affaire en Juillet 2016 est de " + caJuillet16 + " €")
        println("le chiffre d'affaire en Aout 2016 est de " + caAout16 + " €")
        println("le chiffre d'affaire en Septembre 2016 est de " + caSeptembre16 + " €")
        println("le chiffre d'affaire en Octobre 2016 est de " + caOctobre16 + " €")
        println("le chiffre d'affaire en Novembre 2016 est de " + caNovembre16 + " €")
        println("le chiffre d'affaire en Decembre 2016 est de " + caDecembre16 + " €")


        var caJanvier17Temp = 0.0
        var caFevrier17Temp = 0.0
        var caMars17Temp = 0.0
        var caAvril17Temp = 0.0
        var caMai17Temp = 0.0
        var caJuin17Temp = 0.0
        var caJuillet17Temp = 0.0
        var caAout17Temp = 0.0
        var caSeptembre17Temp = 0.0
        var caOctobre17Temp = 0.0
        var caNovembre17Temp = 0.0
        var caDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017") {
                when (data.mois) {
                    "janvier" -> caJanvier17Temp += data.ca.toFloat()
                    "février" -> caFevrier17Temp += data.ca.toFloat()
                    "mars" -> caMars17Temp += data.ca.toFloat()
                    "avril" -> caAvril17Temp += data.ca.toFloat()
                    "mai" -> caMai17Temp += data.ca.toFloat()
                    "juin" -> caJuin17Temp += data.ca.toFloat()
                    "juillet" -> caJuillet17Temp += data.ca.toFloat()
                    "aout" -> caAout17Temp += data.ca.toFloat()
                    "septembre" -> caSeptembre17Temp += data.ca.toFloat()
                    "octobre" -> caOctobre17Temp += data.ca.toFloat()
                    "novembre" -> caNovembre17Temp += data.ca.toFloat()
                    "decembre" -> caDecembre17Temp += data.ca.toFloat()
                }
            }
        }

        val caJanvier17 = round.format(caJanvier17Temp).toFloat()
        val caFevrier17 = round.format(caFevrier17Temp).toFloat()
        val caMars17 = round.format(caMai17Temp).toFloat()
        val caAvril17 = round.format(caAout17Temp).toFloat()
        val caMai17 = round.format(caMai17Temp).toFloat()
        val caJuin17 = round.format(caJuin17Temp).toFloat()
        val caJuillet17 = round.format(caJuillet17Temp).toFloat()
        val caAout17 = round.format(caAout17Temp).toFloat()
        val caSeptembre17 = round.format(caSeptembre17Temp).toFloat()
        val caOctobre17 = round.format(caOctobre17Temp).toFloat()
        val caNovembre17 = round.format(caNovembre17Temp).toFloat()
        val caDecembre17 = round.format(caDecembre17Temp).toFloat()

        println("-------------- Chiffre d'affaire en 2017 ---------------")


        println("le chiffre d'affaire en Janvier 2017 est de " + caJanvier17 + " €")
        println("le chiffre d'affaire en Fevrier 2017 est de " + caFevrier17 + " €")
        println("le chiffre d'affaire en Mars 2017 est de " + caMars17 + " €")
        println("le chiffre d'affaire en Avril 2017 est de " + caAvril17 + " €")
        println("le chiffre d'affaire en Mai 2017 est de " + caMai17 + " €")
        println("le chiffre d'affaire en Juin 2017 est de " + caJuin17 + " €")
        println("le chiffre d'affaire en Juillet 2017 est de " + caJuillet17 + " €")
        println("le chiffre d'affaire en Aout 2017 est de " + caAout17 + " €")
        println("le chiffre d'affaire en Septembre 2017 est de " + caSeptembre17 + " €")
        println("le chiffre d'affaire en Octobre 2017 est de " + caOctobre17 + " €")
        println("le chiffre d'affaire en Novembre 2017 est de " + caNovembre17 + " €")
        println("le chiffre d'affaire en Decembre 2017 est de " + caDecembre17 + " €")


        var caJanvier18Temp = 0.0
        var caFevrier18Temp = 0.0
        var caMars18Temp = 0.0
        var caAvril18Temp = 0.0
        var caMai18Temp = 0.0
        var caJuin18Temp = 0.0
        var caJuillet18Temp = 0.0
        var caAout18Temp = 0.0
        var caSeptembre18Temp = 0.0
        var caOctobre18Temp = 0.0
        var caNovembre18Temp = 0.0
        var caDecembre18Temp = 0.0

        for (data in myList){
            if (data.annee == "2018") {
                when (data.mois) {
                    "janvier" -> caJanvier18Temp += data.ca.toFloat()
                    "février" -> caFevrier18Temp += data.ca.toFloat()
                    "mars" -> caMars18Temp += data.ca.toFloat()
                    "avril" -> caAvril18Temp += data.ca.toFloat()
                    "mai" -> caMai18Temp += data.ca.toFloat()
                    "juin" -> caJuin18Temp += data.ca.toFloat()
                    "juillet" -> caJuillet18Temp += data.ca.toFloat()
                    "aout" -> caAout18Temp += data.ca.toFloat()
                    "septembre" -> caSeptembre18Temp += data.ca.toFloat()
                    "octobre" -> caOctobre18Temp += data.ca.toFloat()
                    "novembre" -> caNovembre18Temp += data.ca.toFloat()
                    "decembre" -> caDecembre18Temp += data.ca.toFloat()
                }
            }
        }

        val caJanvier18 = round.format(caJanvier18Temp).toFloat()
        val caFevrier18 = round.format(caFevrier18Temp).toFloat()
        val caMars18 = round.format(caMars18Temp).toFloat()
        val caAvril18 = round.format(caAvril18Temp).toFloat()
        val caMai18 = round.format(caMai18Temp).toFloat()
        val caJuin18 = round.format(caJuin18Temp).toFloat()
        val caJuillet18 = round.format(caJuillet18Temp).toFloat()
        val caAout18 = round.format(caAout18Temp).toFloat()
        val caSeptembre18 = round.format(caSeptembre18Temp).toFloat()
        val caOctobre18 = round.format(caOctobre18Temp).toFloat()
        val caNovembre18 = round.format(caNovembre18Temp).toFloat()
        val caDecembre18 = round.format(caDecembre18Temp).toFloat()

        println("-------------- Chiffre d'affaire en 2018 ---------------")

        println("le chiffre d'affaire en Janvier 2018 est de " + caJanvier18 + " €")
        println("le chiffre d'affaire en Fevrier 2018 est de " + caFevrier18 + " €")
        println("le chiffre d'affaire en Mars 2018 est de " + caMars18 + " €")
        println("le chiffre d'affaire en Avril 2018 est de " + caAvril18 + " €")
        println("le chiffre d'affaire en Mai 2018 est de " + caMai18 + " €")
        println("le chiffre d'affaire en Juin 2018 est de " + caJuin18 + " €")
        println("le chiffre d'affaire en Juillet 2018 est de " + caJuillet18 + " €")
        println("le chiffre d'affaire en Aout 2018 est de " + caAout18 + " €")
        println("le chiffre d'affaire en Septembre 2018 est de " + caSeptembre18 + " €")
        println("le chiffre d'affaire en Octobre 2018 est de " + caOctobre18 + " €")
        println("le chiffre d'affaire en Novembre 2018 est de " + caNovembre18 + " €")
        println("le chiffre d'affaire en Decembre 2018 est de " + caDecembre18 + " €")


        println("-------------- Chiffre d'affaire par appareil ---------------")

        // Chiffre d'affaire par appareil

        var caOrdinateursTemp = 0.0
        var caTelephonesTemp = 0.0
        var caTablettesTemp = 0.0
        var caAutreTemp = 0.0

        for (data in myList){
            when (data.appareil) {
                "Ordinateurs" ->  caOrdinateursTemp += data.ca.toFloat()
                "Téléphones mobiles" -> caTelephonesTemp += data.ca.toFloat()
                "Tablettes" -> caTablettesTemp += data.ca.toFloat()
                "Autre" -> caAutreTemp += data.ca.toFloat()
            }
        }

        val caOrdinateurs = round.format(caOrdinateursTemp).toFloat()
        val caTelephones = round.format(caTelephonesTemp).toFloat()
        val caTablettes = round.format(caTablettesTemp).toFloat()
        val caAutre = round.format(caAutreTemp).toFloat()


        println("Le chiffre d'affaires par ordinateurs est de " + caOrdinateurs + " €")
        println("Le chiffre d'affaires par Téléphones mobiles est de " + caTelephones + " €")
        println("Le chiffre d'affaires par Tablettes est de " + caTelephones + " €")
        println("Le chiffre d'affaires pour 'Autre' est de " + caAutre + " €")

        println("------------- Autre ----------------")


        // Ratio Coût / clic

        var clicSum = 0.0
        for (data in myList){
            clicSum += data.clics.toFloat()
        }


        var coutSum = 0.0
        for (data in myList){
            coutSum += data.cout.toFloat()
        }

        val clicRatio = round.format(coutSum / clicSum).toFloat()
        println("Le coût par clic est de " + clicRatio + " €")



        // Ratio (Clic/Impression)*100

        var impressionSum = 0.0
        for (data in myList){
            impressionSum += data.impressions.toFloat()
        }

        val ratioClicImpression = round.format((clicSum / impressionSum)*100).toFloat()
        println("Le Taux de clic est de " + ratioClicImpression + " %")


        // ROI : CA Total / Coût

        var caSum = 0.0
        for (data in myList){
            caSum += data.ca.toFloat()
        }

        val ROI = round.format(caSum / coutSum).toFloat()
        println("Le ROI est de " + ROI)


        // Le panier Moyen : CA / Commandes

        var commandesSum = 0.0
        for (data in myList){
            commandesSum += data.commandes.toFloat()
        }

        val panierMoyen = round.format(caSum / commandesSum).toFloat()
        println("Le panier moyen est de " + panierMoyen + " €")



        // ROI segmenté par appareil et par mois (uniquement sur 2017)


        // CA ordinateurs par mois en 2017

        var caordiJanvier17Temp = 0.0
        var caordiFevrier17Temp = 0.0
        var caordiMars17Temp = 0.0
        var caordiAvril17Temp = 0.0
        var caordiMai17Temp = 0.0
        var caordiJuin17Temp = 0.0
        var caordiJuillet17Temp = 0.0
        var caordiAout17Temp = 0.0
        var caordiSeptembre17Temp = 0.0
        var caordiOctobre17Temp = 0.0
        var caordiNovembre17Temp = 0.0
        var caordiDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017" && data.appareil == "Ordinateurs"){
                when (data.mois){
                    "janvier" -> caordiJanvier17Temp += data.ca.toFloat()
                    "février" -> caordiFevrier17Temp += data.ca.toFloat()
                    "mars" -> caordiMars17Temp += data.ca.toFloat()
                    "avril" -> caordiAvril17Temp += data.ca.toFloat()
                    "mai" -> caordiMai17Temp += data.ca.toFloat()
                    "juin" -> caordiJuin17Temp += data.ca.toFloat()
                    "juillet" -> caordiJuillet17Temp += data.ca.toFloat()
                    "aout" -> caordiAout17Temp += data.ca.toFloat()
                    "septembre" -> caordiSeptembre17Temp += data.ca.toFloat()
                    "octobre" -> caordiOctobre17Temp += data.ca.toFloat()
                    "novembre" -> caordiNovembre17Temp += data.ca.toFloat()
                    "decembre" -> caordiDecembre17Temp += data.ca.toFloat()
                }
            }
        }

        // Coût ordinateurs par mois en 2017

        var coutordiJanvier17Temp = 0.0
        var coutordiFevrier17Temp = 0.0
        var coutordiMars17Temp = 0.0
        var coutordiAvril17Temp = 0.0
        var coutordiMai17Temp = 0.0
        var coutordiJuin17Temp = 0.0
        var coutordiJuillet17Temp = 0.0
        var coutordiAout17Temp = 0.0
        var coutordiSeptembre17Temp = 0.0
        var coutordiOctobre17Temp = 0.0
        var coutordiNovembre17Temp = 0.0
        var coutordiDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017" && data.appareil == "Ordinateurs"){
                when (data.mois){
                    "janvier" -> coutordiJanvier17Temp += data.cout.toFloat()
                    "février" -> coutordiFevrier17Temp += data.cout.toFloat()
                    "mars" -> coutordiMars17Temp += data.cout.toFloat()
                    "avril" -> coutordiAvril17Temp += data.cout.toFloat()
                    "mai" -> coutordiMai17Temp += data.cout.toFloat()
                    "juin" -> coutordiJuin17Temp += data.cout.toFloat()
                    "juillet" -> coutordiJuillet17Temp += data.cout.toFloat()
                    "aout" -> coutordiAout17Temp += data.cout.toFloat()
                    "septembre" -> coutordiSeptembre17Temp += data.cout.toFloat()
                    "octobre" -> coutordiOctobre17Temp += data.cout.toFloat()
                    "novembre" -> coutordiNovembre17Temp += data.cout.toFloat()
                    "decembre" -> coutordiDecembre17Temp += data.cout.toFloat()
                }
            }
        }

        // CA Téléphones mobiles par mois en 2017

        var caTelephoneJanvier17Temp = 0.0
        var caTelephoneFevrier17Temp = 0.0
        var caTelephoneMars17Temp = 0.0
        var caTelephoneAvril17Temp = 0.0
        var caTelephoneMai17Temp = 0.0
        var caTelephoneJuin17Temp = 0.0
        var caTelephoneJuillet17Temp = 0.0
        var caTelephoneAout17Temp = 0.0
        var caTelephoneSeptembre17Temp = 0.0
        var caTelephoneOctobre17Temp = 0.0
        var caTelephoneNovembre17Temp = 0.0
        var caTelephoneDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017" && data.appareil == "Téléphones mobiles"){
                when (data.mois){
                    "janvier" -> caTelephoneJanvier17Temp += data.ca.toFloat()
                    "février" -> caTelephoneFevrier17Temp += data.ca.toFloat()
                    "mars" -> caTelephoneMars17Temp += data.ca.toFloat()
                    "avril" -> caTelephoneAvril17Temp += data.ca.toFloat()
                    "mai" -> caTelephoneMai17Temp += data.ca.toFloat()
                    "juin" -> caTelephoneJuin17Temp += data.ca.toFloat()
                    "juillet" -> caTelephoneJuillet17Temp += data.ca.toFloat()
                    "aout" -> caTelephoneAout17Temp += data.ca.toFloat()
                    "septembre" -> caTelephoneSeptembre17Temp += data.ca.toFloat()
                    "octobre" -> caTelephoneOctobre17Temp += data.ca.toFloat()
                    "novembre" -> caTelephoneNovembre17Temp += data.ca.toFloat()
                    "decembre" -> caTelephoneDecembre17Temp += data.ca.toFloat()
                }
            }
        }

        // Coût téléphones mobiles par mois en 2017

        var coutTelephoneJanvier17Temp = 0.0
        var coutTelephoneFevrier17Temp = 0.0
        var coutTelephoneMars17Temp = 0.0
        var coutTelephoneAvril17Temp = 0.0
        var coutTelephoneMai17Temp = 0.0
        var coutTelephoneJuin17Temp = 0.0
        var coutTelephoneJuillet17Temp = 0.0
        var coutTelephoneAout17Temp = 0.0
        var coutTelephoneSeptembre17Temp = 0.0
        var coutTelephoneOctobre17Temp = 0.0
        var coutTelephoneNovembre17Temp = 0.0
        var coutTelephoneDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017" && data.appareil == "Téléphones mobiles"){
                when (data.mois){
                    "janvier" -> coutTelephoneJanvier17Temp += data.cout.toFloat()
                    "février" -> coutTelephoneFevrier17Temp += data.cout.toFloat()
                    "mars" -> coutTelephoneMars17Temp += data.cout.toFloat()
                    "avril" -> coutTelephoneAvril17Temp += data.cout.toFloat()
                    "mai" -> coutTelephoneMai17Temp += data.cout.toFloat()
                    "juin" -> coutTelephoneJuin17Temp += data.cout.toFloat()
                    "juillet" -> coutTelephoneJuillet17Temp += data.cout.toFloat()
                    "aout" -> coutTelephoneAout17Temp += data.cout.toFloat()
                    "septembre" -> coutTelephoneSeptembre17Temp += data.cout.toFloat()
                    "octobre" -> coutTelephoneOctobre17Temp += data.cout.toFloat()
                    "novembre" -> coutTelephoneNovembre17Temp += data.cout.toFloat()
                    "decembre" -> coutTelephoneDecembre17Temp += data.cout.toFloat()
                }
            }
        }

        // CA Tablettes par mois en 2017

        var caTabletteJanvier17Temp = 0.0
        var caTabletteFevrier17Temp = 0.0
        var caTabletteMars17Temp = 0.0
        var caTabletteAvril17Temp = 0.0
        var caTabletteMai17Temp = 0.0
        var caTabletteJuin17Temp = 0.0
        var caTabletteJuillet17Temp = 0.0
        var caTabletteAout17Temp = 0.0
        var caTabletteSeptembre17Temp = 0.0
        var caTabletteOctobre17Temp = 0.0
        var caTabletteNovembre17Temp = 0.0
        var caTabletteDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017" && data.appareil == "Tablettes"){
                when (data.mois){
                    "janvier" -> caTabletteJanvier17Temp += data.ca.toFloat()
                    "février" -> caTabletteFevrier17Temp += data.ca.toFloat()
                    "mars" -> caTabletteMars17Temp += data.ca.toFloat()
                    "avril" -> caTabletteAvril17Temp += data.ca.toFloat()
                    "mai" -> caTabletteMai17Temp += data.ca.toFloat()
                    "juin" -> caTabletteJuin17Temp += data.ca.toFloat()
                    "juillet" -> caTabletteJuillet17Temp += data.ca.toFloat()
                    "aout" -> caTabletteAout17Temp += data.ca.toFloat()
                    "septembre" -> caTabletteSeptembre17Temp += data.ca.toFloat()
                    "octobre" -> caTabletteOctobre17Temp += data.ca.toFloat()
                    "novembre" -> caTabletteNovembre17Temp += data.ca.toFloat()
                    "decembre" -> caTabletteDecembre17Temp += data.ca.toFloat()
                }
            }
        }

        // Coût tablettes par mois en 2017

        var coutTabletteJanvier17Temp = 0.0
        var coutTabletteFevrier17Temp = 0.0
        var coutTabletteMars17Temp = 0.0
        var coutTabletteAvril17Temp = 0.0
        var coutTabletteMai17Temp = 0.0
        var coutTabletteJuin17Temp = 0.0
        var coutTabletteJuillet17Temp = 0.0
        var coutTabletteAout17Temp = 0.0
        var coutTabletteSeptembre17Temp = 0.0
        var coutTabletteOctobre17Temp = 0.0
        var coutTabletteNovembre17Temp = 0.0
        var coutTabletteDecembre17Temp = 0.0

        for (data in myList){
            if (data.annee == "2017" && data.appareil == "Tablettes"){
                when (data.mois){
                    "janvier" -> coutTabletteJanvier17Temp += data.cout.toFloat()
                    "février" -> coutTabletteFevrier17Temp += data.cout.toFloat()
                    "mars" -> coutTabletteMars17Temp += data.cout.toFloat()
                    "avril" -> coutTabletteAvril17Temp += data.cout.toFloat()
                    "mai" -> coutTabletteMai17Temp += data.cout.toFloat()
                    "juin" -> coutTabletteJuin17Temp += data.cout.toFloat()
                    "juillet" -> coutTabletteJuillet17Temp += data.cout.toFloat()
                    "aout" -> coutTabletteAout17Temp += data.cout.toFloat()
                    "septembre" -> coutTabletteSeptembre17Temp += data.cout.toFloat()
                    "octobre" -> coutTabletteOctobre17Temp += data.cout.toFloat()
                    "novembre" -> coutTabletteNovembre17Temp += data.cout.toFloat()
                    "decembre" -> coutTabletteDecembre17Temp += data.cout.toFloat()
                }
            }
        }

        println("-------------- ROI ordinateurs 2017 ---------------")

        val RoiordiJanvier17 = round.format(caordiJanvier17Temp / coutordiJanvier17Temp).toFloat()
        val RoiordiFevrier17 = caordiFevrier17Temp / coutordiFevrier17Temp
        val RoiordiMars17 = round.format(caordiMars17Temp / coutordiMars17Temp).toFloat()
        val RoiordiAvril17 = round.format(caordiAvril17Temp / coutordiAvril17Temp).toFloat()
        val RoiordiMai17 = round.format(caordiMai17Temp / coutordiMai17Temp).toFloat()
        val RoiordiJuin17 = round.format(caordiJuin17Temp / coutordiJuin17Temp).toFloat()
        val RoiordiJuillet17 = round.format(caordiJuillet17Temp / coutordiJuillet17Temp).toFloat()
        val RoiordiAout17 = round.format(caordiAout17Temp / coutordiAout17Temp).toFloat()
        val RoiordiSeptembre17 = round.format(caordiSeptembre17Temp / coutordiSeptembre17Temp).toFloat()
        val RoiordiOctobre17 = round.format(caordiOctobre17Temp / coutordiOctobre17Temp).toFloat()
        val RoiordiNovembre17 = round.format(caordiNovembre17Temp / coutordiNovembre17Temp).toFloat()
        val RoiordiDecembre17 = round.format(caordiDecembre17Temp / coutordiNovembre17Temp).toFloat()

        println("le ROI des ordinateurs en Janvier 2017 est de " + RoiordiJanvier17)
        println("le ROI des ordinateurs en Fevrier 2017 est de " + RoiordiFevrier17)
        println("le ROI des ordinateurs en Mars 2017 est de " + RoiordiMars17)
        println("le ROI des ordinateurs en Avril 2017 est de " + RoiordiAvril17)
        println("le ROI des ordinateurs en Mai 2017 est de " + RoiordiMai17)
        println("le ROI des ordinateurs en Juin 2017 est de " + RoiordiJuin17)
        println("le ROI des ordinateurs en Juillet 2017 est de " + RoiordiJuillet17)
        println("le ROI des ordinateurs en Aout 2017 est de " + RoiordiAout17)
        println("le ROI des ordinateurs en Septembre 2017 est de " + RoiordiSeptembre17)
        println("le ROI des ordinateurs en Octobre 2017 est de " + RoiordiOctobre17)
        println("le ROI des ordinateurs en Novembre 2017 est de " + RoiordiNovembre17)
        println("le ROI des ordinateurs en Decembre 2017 est de " + RoiordiDecembre17)

        println("-------------- ROI Téléphones mobiles 2017 ---------------")

        val RoiTelephoneJanvier17 = round.format(caTelephoneJanvier17Temp / coutTelephoneJanvier17Temp).toFloat()
        val RoiTelephoneFevrier17 = caTelephoneFevrier17Temp / coutTelephoneFevrier17Temp
        val RoiTelephoneMars17 = round.format(caTelephoneMars17Temp / coutTelephoneMars17Temp).toFloat()
        val RoiTelephoneAvril17 = round.format(caTelephoneAvril17Temp / coutTelephoneAvril17Temp).toFloat()
        val RoiTelephoneMai17 = round.format(caTelephoneMai17Temp / coutTelephoneMai17Temp).toFloat()
        val RoiTelephoneJuin17 = round.format(caTelephoneJuin17Temp / coutTelephoneJuin17Temp).toFloat()
        val RoiTelephoneJuillet17 = round.format(caTelephoneJuillet17Temp / coutTelephoneJuillet17Temp).toFloat()
        val RoiTelephoneAout17 = round.format(caTelephoneAout17Temp / coutTelephoneAout17Temp).toFloat()
        val RoiTelephoneSeptembre17 = round.format(caTelephoneSeptembre17Temp / coutTelephoneSeptembre17Temp).toFloat()
        val RoiTelephoneOctobre17 = round.format(caTelephoneOctobre17Temp / coutTelephoneOctobre17Temp).toFloat()
        val RoiTelephoneNovembre17 = round.format(caTelephoneNovembre17Temp / coutTelephoneNovembre17Temp).toFloat()
        val RoiTelephoneDecembre17 = round.format(caTelephoneDecembre17Temp / coutTelephoneNovembre17Temp).toFloat()

        println("le ROI des Téléphones mobiles en Janvier 2017 est de " + RoiTelephoneJanvier17)
        println("le ROI des Téléphones mobiles en Fevrier 2017 est de " + RoiTelephoneFevrier17)
        println("le ROI des Téléphones mobiles en Mars 2017 est de " + RoiTelephoneMars17)
        println("le ROI des Téléphones mobiles en Avril 2017 est de " + RoiTelephoneAvril17)
        println("le ROI des Téléphones mobiles en Mai 2017 est de " + RoiTelephoneMai17)
        println("le ROI des Téléphones mobiles en Juin 2017 est de " + RoiTelephoneJuin17)
        println("le ROI des Téléphones mobiles en Juillet 2017 est de " + RoiTelephoneJuillet17)
        println("le ROI des Téléphones mobiles en Aout 2017 est de " + RoiTelephoneAout17)
        println("le ROI des Téléphones mobiles en Septembre 2017 est de " + RoiTelephoneSeptembre17)
        println("le ROI des Téléphones mobiles en Octobre 2017 est de " + RoiTelephoneOctobre17)
        println("le ROI des Téléphones mobiles en Novembre 2017 est de " + RoiTelephoneNovembre17)
        println("le ROI des Téléphones mobiles en Decembre 2017 est de " + RoiTelephoneDecembre17)

        println("-------------- ROI Tablettes 2017 ---------------")

        val RoiTabletteJanvier17 = round.format(caTabletteJanvier17Temp / coutTabletteJanvier17Temp).toFloat()
        val RoiTabletteFevrier17 = caTabletteFevrier17Temp / coutTabletteFevrier17Temp
        val RoiTabletteMars17 = round.format(caTabletteMars17Temp / coutTabletteMars17Temp).toFloat()
        val RoiTabletteAvril17 = round.format(caTabletteAvril17Temp / coutTabletteAvril17Temp).toFloat()
        val RoiTabletteMai17 = round.format(caTabletteMai17Temp / coutTabletteMai17Temp).toFloat()
        val RoiTabletteJuin17 = round.format(caTabletteJuin17Temp / coutTabletteJuin17Temp).toFloat()
        val RoiTabletteJuillet17 = round.format(caTabletteJuillet17Temp / coutTabletteJuillet17Temp).toFloat()
        val RoiTabletteAout17 = round.format(caTabletteAout17Temp / coutTabletteAout17Temp).toFloat()
        val RoiTabletteSeptembre17 = round.format(caTabletteSeptembre17Temp / coutTabletteSeptembre17Temp).toFloat()
        val RoiTabletteOctobre17 = round.format(caTabletteOctobre17Temp / coutTabletteOctobre17Temp).toFloat()
        val RoiTabletteNovembre17 = round.format(caTabletteNovembre17Temp / coutTabletteNovembre17Temp).toFloat()
        val RoiTabletteDecembre17 = round.format(caTabletteDecembre17Temp / coutTabletteNovembre17Temp).toFloat()

        println("le ROI des Tablettes en Janvier 2017 est de " + RoiTabletteJanvier17)
        println("le ROI des Tablettes en Fevrier 2017 est de " + RoiTabletteFevrier17)
        println("le ROI des Tablettes en Mars 2017 est de " + RoiTabletteMars17)
        println("le ROI des Tablettes en Avril 2017 est de " + RoiTabletteAvril17)
        println("le ROI des Tablettes en Mai 2017 est de " + RoiTabletteMai17)
        println("le ROI des Tablettes en Juin 2017 est de " + RoiTabletteJuin17)
        println("le ROI des Tablettes en Juillet 2017 est de " + RoiTabletteJuillet17)
        println("le ROI des Tablettes en Aout 2017 est de " + RoiTabletteAout17)
        println("le ROI des Tablettes en Septembre 2017 est de " + RoiTabletteSeptembre17)
        println("le ROI des Tablettes en Octobre 2017 est de " + RoiTabletteOctobre17)
        println("le ROI des Tablettes en Novembre 2017 est de " + RoiTabletteNovembre17)
        println("le ROI des Tablettes en Decembre 2017 est de " + RoiTabletteDecembre17)


        // Création du CSV

        val KPI_CSV = Arrays.asList(
                CSV_WRITE(caOrdinateurs, caTelephones, caTablettes, caAutre, panierMoyen, clicRatio, ratioClicImpression, ROI)
        )

        var fileWriter: FileWriter? = null
            try {
                fileWriter = FileWriter("src/main/resources/KPI.csv")
                fileWriter.append(CSV_HEADER)
                fileWriter.append('\n')

                for (CSV in KPI_CSV) {
                    fileWriter.append(CSV.caOrdinateurs.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.caTelephone.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.caTablette.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.caAutre.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.panier.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.coutparclic.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.tauxclic.toString())
                    fileWriter.append(',')
                    fileWriter.append(CSV.ROI.toString())
                    fileWriter.append('\n')
                }
                println("-------------------------------------------------")
                println("CSV créé avec succès!")
            } catch (e: Exception) {
                println("Erreur lors de la création du CSV!")
                e.printStackTrace()
            } finally {
                try {
                    fileWriter!!.flush()
                    fileWriter.close()
                } catch (e: IOException) {
                    println("Flushing/closing error!")
                    e.printStackTrace()
                }
            }
    } catch (e: Exception) {
        println("Erreur lors de la lecture du CSV!")
        e.printStackTrace()
    } finally {
        try {
            fileReader!!.close()
            csvParser!!.close()
        } catch (e: IOException) {
            println("Closing fileReader/csvParser Error!")
            e.printStackTrace()
        }
    }
}


