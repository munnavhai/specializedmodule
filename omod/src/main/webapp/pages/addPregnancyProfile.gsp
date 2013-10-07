<%
 ui.decorateWith("appui", "standardEmrPage")
%>

<div id="content" class="container">
   <h1>${ ui.message("specializedmodule.addPregnancyDetaile.title") }</h1>
   <fieldset>
       <legend>${ ui.message("specializedmodule.addPregnancyDetaile") }</legend>
       <form class="simple-form-ui" id="addPregnancyProfile" method="POST">
           ${ ui.includeFragment("uicommons", "field/text", [label:ui.message("specializedmodule.patientId"), formFieldName:"patientId"]) }
           ${ ui.includeFragment("uicommons", "field/text", [label:ui.message("specializedmodule.lastLMPDat"), formFieldName:"lastLMPDat"]) }
           ${ ui.includeFragment("uicommons", "field/text", [label:ui.message("specializedmodule.approxDeliveryDate"), formFieldName:"approxDeliveryDate"]) }
           ${ ui.includeFragment("uicommons", "field/text", [label:ui.message("specializedmodule.lastVisitDate"), formFieldName:"lastVisitDate"]) }
           ${ ui.includeFragment("uicommons", "field/text", [label:ui.message("specializedmodule.nextCheckupDate"), formFieldName:"nextCheckupDate"]) }
           <input type="submit" class="button" value="${ ui.message("general.save") }"/>
       </form>
   </fieldset>
</div>