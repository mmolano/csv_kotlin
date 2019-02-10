data class CSVDATA(
    val annee: String,
    val appareil: String,
    val commandes: Number,
    val impressions: Number,
    val clics: Number,
    val cout: Number,
    val ca: Number,
    val mois: String
)

data class CSV_WRITE(
    val caOrdinateurs: Number,
    val caTelephone: Number,
    val caTablette: Number,
    val caAutre: Number,
    val panier: Number,
    val coutparclic: Number,
    val tauxclic: Number,
    val ROI: Number
)