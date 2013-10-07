<div>
    <h3>${ ui.message("List of existing Patient") }</h3>

<table>
    <tr>
        <th>${ ui.message("Patient ID") }</th>
        <th>${ ui.message("Last LMP Date") }</th>
        <th>${ ui.message("Approximate Delivery Date") }</th>
        <th>${ ui.message("Last visit Date") }</th>
		<th>${ ui.message("Next visit Date") }</th>
    </tr>
  
        <% pregProfile.each { %>
            <tr>
                <td>${ ui.format(it.patientId) }</td>
                <td>${ ui.format(it.lastLMPDat) }</td>
                <td>${ ui.format(it.approxDeliveryDate) }</td>
                <td>${ ui.format(it.lastVisitDate) }</td>
				<td>${ ui.format(it.nextCheckupDate) }</td>
            </tr>
        <% } %>
 
</table>
    
    <br>
    ${ui.includeFragment("uilibrary", "widget/button", [
        label: ui.message("Add pregnancy Details"),
        href: "addPregnancyProfile.page"])
    }
</div>