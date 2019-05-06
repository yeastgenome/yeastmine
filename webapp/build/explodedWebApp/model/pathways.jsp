<!-- pathways.jsp -->
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>

<table width="100%">
  <tr>
    <td valign="top">
      <div class="heading2">
        Current data
      </div>
      <div class="body">


     <dt>Pathway data in YeastMine is available for
     <i>S. cerevisiae</i> and comes from <a
     href="http://pathway.yeastgenome.org/" target="_new">Yeast Biochemical Pathways</a> 
     </dt>

       </div>
    </td>

    <td width="40%" valign="top">
      <div class="heading2">
        Bulk download
      </div>
      <div class="body">
         <ul>

          <li>
            <im:querylink text="All SGD pathways with associated genes " skipBuilder="true">

            <query name="" model="genomic" view="Pathway.identifier Pathway.name Pathway.genes.primaryIdentifier Pathway.genes.symbol"></query>
            </im:querylink>

          </li>
         </ul>
      </div>
    </td>
  </tr>
</table>
<!-- /pathways.jsp -->
