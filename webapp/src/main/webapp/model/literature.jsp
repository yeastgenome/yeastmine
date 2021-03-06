<!-- literature.jsp -->
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>


<table width="100%">
  <tr>
    <td valign="top">
      <div class="heading2">
        Current data
      </div>
      <div class="body">


          <p>A mapping between genes and publications for <i>S. cerevisiae</i> from NCBI and <i>S. cerevisiae</i> from SGD.
</p>

      </div>
    </dl>


    </td>

    <td width="40%" valign="top">
      <div class="heading2">
        Bulk download
      </div>
      <div class="body">
        <ul>

     
          <li>
          <im:querylink text="All <i> S. cerevisiae</i> publications"  skipBuilder="true">
<query name="" model="genomic" view="Gene.publications.year Gene.publications.firstAuthor Gene.publications.journal Gene.publications.title Gene.publications.pubMedId" sortOrder="Gene.publications.year asc">
  <node path="Gene" type="Gene">
  </node>
  <node path="Gene.organism" type="Organism">
    <constraint op="LOOKUP" value="Saccharomyces cerevisiae" description="" identifier="" code="A" extraValue="">
    </constraint>
  </node>
</query>
           </im:querylink>
          </li>

        </ul>
      </div>
    </td>

  </tr>
</table>
<!-- /literature.jsp -->