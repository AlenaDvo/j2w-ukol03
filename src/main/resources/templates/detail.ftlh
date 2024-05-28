[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${detailVizitky.jmeno}</div>
        <div class="firma">${detailVizitky.firma}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${detailVizitky.ulice}</div>
                <div><span>${detailVizitky.obecPsc}</span></div>
            </div>
            <div class="kontakty">
                <div><i class="las la-at"></i>[#if detailVizitky.email??]<span>${detailVizitky.email}</span>[#else]<small><em>neuvedeno</em></small>[/#if]</div>
                <div><i class="las la-phone-alt"></i>[#if detailVizitky.telefon??]<span>${detailVizitky.telefon}</span>[#else]<small><em>neuvedeno</em></small>[/#if]</div>
                <div><i class="las la-globe"></i>[#if detailVizitky.web??]<span>${detailVizitky.web}</span>[#else]<small><em>neuvedeno</em></small>[/#if]</div>
            </div>
        </div>
    </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${detailVizitky.celaAdresa?url("UTF-8")}" width="100%" height="100%" frameborder="0"></iframe>
    </div>

</div>
</body>
</html>
