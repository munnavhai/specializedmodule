<%
 ui.decorateWith("appui", "standardEmrPage")
%>

<h1>${ ui.message("specializedmodule.specializedmodule") }</h1>
<h2>${ ui.message("specializedmodule.addPregnancyProfile.title") }!</h2>

${ ui.includeFragment("specializedmodule", "viewPregnancyProfile") }