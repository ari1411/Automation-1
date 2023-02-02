<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Tipo de documentoCodigo Unico de Identi_ba5feb</name>
   <tag></tag>
   <elementGuidId>bf374838-4195-4ec1-a189-1255e28a7ab8</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#datosContent</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='datosContent']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>datosContent</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>panel-body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  
    

    
    
  
  
    
Tipo de documento

Codigo Unico de Identificacion Tributaria [2]kendo.syncReady(function(){jQuery(&quot;#TipoDocumentoId&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoDocumento,&quot;dataBound&quot;:SetTipoPersonaDefault,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;2&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetTiposDocumento&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Número de documento

kendo.syncReady(function(){jQuery(&quot;#NumeroDocumento&quot;).kendoTextBox({});});    
    
Tipo de persona

Persona física [1]kendo.syncReady(function(){jQuery(&quot;#TipoPersonaId&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoPersona,&quot;dataBound&quot;:SetTipoPersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;2&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetTiposPersona&quot;,&quot;data&quot;:filterTipoDocumento},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  

  
    
Apellido

    
    
Nombre

    
    
Personería jurídica

Seleccionekendo.syncReady(function(){jQuery(&quot;#PersoneriaJuridicaId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetPersoneriasJuridicas&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  

  
    
Nacionalidad

ARGENTINA [1]kendo.syncReady(function(){jQuery(&quot;#NacionalidadId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARGENTINA [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BRASILERO [8]&quot;,&quot;Value&quot;:&quot;8&quot;,&quot;Selected&quot;:false}]});});    
    
      
Grupo económico

kendo.syncReady(function(){jQuery(&quot;#GrupoEconomicoId&quot;).kendoComboBox({&quot;change&quot;:UpdateGrupoEconomico,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetGruposEconomicos&quot;,&quot;data&quot;:filterGrupoEconomico},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Fecha de nacimiento

kendo.syncReady(function(){jQuery(&quot;#FechaNacimiento&quot;).kendoDatePicker({&quot;change&quot;:UpdatePersona,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;max&quot;:new Date(2020,8,25,0,0,0,0)});});    
    
Sexo

Masculino [M]kendo.syncReady(function(){jQuery(&quot;#SexoId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetSexo&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Estado Civil

Seleccionekendo.syncReady(function(){jQuery(&quot;#EstadoCivilId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Casado/a [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Divorciado/a [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Separado/a [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Soltero/a [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Union de hecho [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Viudo/a [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false}]});});    
  

  
    
      
Actividad / Ocupación

77kendo.syncReady(function(){jQuery(&quot;#OcupacionId&quot;).kendoComboBox({&quot;change&quot;:UpdateOcupacion,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetOcupaciones&quot;,&quot;data&quot;:filterOcupacion},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  

  
    
Observaciones

    
    
Persona expuesta políticamente
          
  



  
  
    
Domicilio

Legal - CERRITO  N° 1186 Piso 9 Depto. 999, CIUDAD AUTONOMA DE BUENOS AIRES, CIUDAD AUTÓNOMA DE BUENOS AIRESkendo.syncReady(function(){jQuery(&quot;#PersonaDomicilioId&quot;).kendoDropDownList({&quot;change&quot;:SeleccionarPersonaDomicilio,&quot;dataBound&quot;:SetPersonaDomicilio,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;value&quot;:&quot;0&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetDomiciliosPersona&quot;,&quot;data&quot;:filterPersonaDomicilio},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  
  
    
Tipo

Particular [2]kendo.syncReady(function(){jQuery(&quot;#TipoDomicilioId&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoDomicilio,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Legal [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Particular [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Real [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Sucursal [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});    
    
País

ARABIA SAUDITA [90]kendo.syncReady(function(){jQuery(&quot;#PaisId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePais,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;AFGANISTAN [89]&quot;,&quot;Value&quot;:&quot;89&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ALEMANIA [10]&quot;,&quot;Value&quot;:&quot;10&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ANGOLA [94]&quot;,&quot;Value&quot;:&quot;94&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ANGUILLA [38]&quot;,&quot;Value&quot;:&quot;38&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ANTIGUA Y BARBUDA [39]&quot;,&quot;Value&quot;:&quot;39&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARABIA SAUDITA [90]&quot;,&quot;Value&quot;:&quot;90&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARGENTINA [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARUBA [40]&quot;,&quot;Value&quot;:&quot;40&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;AUSTRIA [77]&quot;,&quot;Value&quot;:&quot;77&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BAHAMAS [41]&quot;,&quot;Value&quot;:&quot;41&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BARBADOS [42]&quot;,&quot;Value&quot;:&quot;42&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BELGICA [78]&quot;,&quot;Value&quot;:&quot;78&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BELICE [25]&quot;,&quot;Value&quot;:&quot;25&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BERMUDAS [32]&quot;,&quot;Value&quot;:&quot;32&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BOLIVIA [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BOSNIA-HERZEGOVINA [68]&quot;,&quot;Value&quot;:&quot;68&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BRASIL [8]&quot;,&quot;Value&quot;:&quot;8&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CANADA [33]&quot;,&quot;Value&quot;:&quot;33&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CHILE [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CHINA [14]&quot;,&quot;Value&quot;:&quot;14&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COLOMBIA [34]&quot;,&quot;Value&quot;:&quot;34&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COREA DEL NORTE [11]&quot;,&quot;Value&quot;:&quot;11&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COREA DEL SUR [84]&quot;,&quot;Value&quot;:&quot;84&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COSTA DE MARFIL [95]&quot;,&quot;Value&quot;:&quot;95&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COSTA RICA [26]&quot;,&quot;Value&quot;:&quot;26&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CROACIA [80]&quot;,&quot;Value&quot;:&quot;80&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CUBA [43]&quot;,&quot;Value&quot;:&quot;43&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CURACAO [44]&quot;,&quot;Value&quot;:&quot;44&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;DOMINICA [45]&quot;,&quot;Value&quot;:&quot;45&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;DOMINICANA, REPUBLICA [46]&quot;,&quot;Value&quot;:&quot;46&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ECUADOR [20]&quot;,&quot;Value&quot;:&quot;20&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EE.UU. [19]&quot;,&quot;Value&quot;:&quot;19&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EGIPTO [96]&quot;,&quot;Value&quot;:&quot;96&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EL SALVADOR [27]&quot;,&quot;Value&quot;:&quot;27&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ESPAÑA [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ETIOPIA [69]&quot;,&quot;Value&quot;:&quot;69&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EXTERIOR (Migración) [121]&quot;,&quot;Value&quot;:&quot;121&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;FRANCIA [12]&quot;,&quot;Value&quot;:&quot;12&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GRANADA [47]&quot;,&quot;Value&quot;:&quot;47&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GRECIA [81]&quot;,&quot;Value&quot;:&quot;81&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUADALUPE [48]&quot;,&quot;Value&quot;:&quot;48&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUATEMALA [28]&quot;,&quot;Value&quot;:&quot;28&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUAYANA FRANCESA [21]&quot;,&quot;Value&quot;:&quot;21&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUYANA [22]&quot;,&quot;Value&quot;:&quot;22&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;HAITI [49]&quot;,&quot;Value&quot;:&quot;49&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;HONDURAS [29]&quot;,&quot;Value&quot;:&quot;29&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IRAN [65]&quot;,&quot;Value&quot;:&quot;65&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IRAQ [70]&quot;,&quot;Value&quot;:&quot;70&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IRLANDA [82]&quot;,&quot;Value&quot;:&quot;82&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS CAIMAN [50]&quot;,&quot;Value&quot;:&quot;50&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS TURCAS Y CAICOS [51]&quot;,&quot;Value&quot;:&quot;51&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS VIRGENES AMERICANAS [52]&quot;,&quot;Value&quot;:&quot;52&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS VIRGENES BRITÁNICAS [53]&quot;,&quot;Value&quot;:&quot;53&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ITALIA [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;JAMAICA [54]&quot;,&quot;Value&quot;:&quot;54&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;JAPON [13]&quot;,&quot;Value&quot;:&quot;13&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;LIBANO [17]&quot;,&quot;Value&quot;:&quot;17&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;LIBIA [86]&quot;,&quot;Value&quot;:&quot;86&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MARRUECOS [97]&quot;,&quot;Value&quot;:&quot;97&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MARTINICA [55]&quot;,&quot;Value&quot;:&quot;55&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MEXICO [36]&quot;,&quot;Value&quot;:&quot;36&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MONTSERRAT [56]&quot;,&quot;Value&quot;:&quot;56&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MYANMAR, BIRMANIA [35]&quot;,&quot;Value&quot;:&quot;35&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;NICARAGUA [30]&quot;,&quot;Value&quot;:&quot;30&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;NIGERIA [98]&quot;,&quot;Value&quot;:&quot;98&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;OTROS PAÍSES DE AFRICA [64]&quot;,&quot;Value&quot;:&quot;64&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;OTROS PAISES DE ASIA [73]&quot;,&quot;Value&quot;:&quot;73&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;OTROS PAISES DE EUROPA [79]&quot;,&quot;Value&quot;:&quot;79&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PAISES BAJOS, HOLANDA [83]&quot;,&quot;Value&quot;:&quot;83&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PAKISTAN [71]&quot;,&quot;Value&quot;:&quot;71&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PANAMA [31]&quot;,&quot;Value&quot;:&quot;31&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PARAGUAY [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PERU [7]&quot;,&quot;Value&quot;:&quot;7&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;POLONIA [9]&quot;,&quot;Value&quot;:&quot;9&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PUERTO RICO [57]&quot;,&quot;Value&quot;:&quot;57&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;REINO UNIDO [85]&quot;,&quot;Value&quot;:&quot;85&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;REPUBLICA DEL CONGO [76]&quot;,&quot;Value&quot;:&quot;76&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;REPUBLICA DEMOCRATICA DEL CONGO\&quot; [75]&quot;,&quot;Value&quot;:&quot;75&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;RUSIA [91]&quot;,&quot;Value&quot;:&quot;91&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAINT MAARTEN [62]&quot;,&quot;Value&quot;:&quot;62&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN BARTOLOME [58]&quot;,&quot;Value&quot;:&quot;58&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN CRISTOBAL Y NEVIS [59]&quot;,&quot;Value&quot;:&quot;59&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN PEDRO Y MIQUELON [37]&quot;,&quot;Value&quot;:&quot;37&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN VICENTE Y LAS GRANADINAS [60]&quot;,&quot;Value&quot;:&quot;60&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SANTA LUCIA [61]&quot;,&quot;Value&quot;:&quot;61&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SERBIA [72]&quot;,&quot;Value&quot;:&quot;72&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SIRIA [16]&quot;,&quot;Value&quot;:&quot;16&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SUDAN [66]&quot;,&quot;Value&quot;:&quot;66&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SUDAN DEL SUR [67]&quot;,&quot;Value&quot;:&quot;67&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SUIZA [87]&quot;,&quot;Value&quot;:&quot;87&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SURINAM [23]&quot;,&quot;Value&quot;:&quot;23&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TAIWAN [15]&quot;,&quot;Value&quot;:&quot;15&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TRINIDAD Y TOBAGO [63]&quot;,&quot;Value&quot;:&quot;63&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TUNEZ [74]&quot;,&quot;Value&quot;:&quot;74&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TURQUIA [92]&quot;,&quot;Value&quot;:&quot;92&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;UCRANIA [88]&quot;,&quot;Value&quot;:&quot;88&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;URUGUAY [24]&quot;,&quot;Value&quot;:&quot;24&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;VENEZUELA [18]&quot;,&quot;Value&quot;:&quot;18&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;VIETNAM [93]&quot;,&quot;Value&quot;:&quot;93&quot;,&quot;Selected&quot;:false}]});});    
    
Provincia

Seleccionekendo.syncReady(function(){jQuery(&quot;#ProvinciaId&quot;).kendoDropDownList({&quot;change&quot;:UpdateProvincia,&quot;dataBound&quot;:ChequearEnabledPaisProvincia,&quot;autoBind&quot;:false,&quot;cascadeFrom&quot;:&quot;PaisId&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:false,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetProvincias&quot;,&quot;data&quot;:filterProvincia},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  
  
    
      
Localidad

716kendo.syncReady(function(){jQuery(&quot;#LocalidadId&quot;).kendoComboBox({&quot;change&quot;:UpdateLocalidad,&quot;dataBound&quot;:ChequearEnabledPaisLocalidad,&quot;autoBind&quot;:false,&quot;cascadeFrom&quot;:&quot;ProvinciaId&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:false,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetLocalidades&quot;,&quot;data&quot;:filterLocalidad},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
C. P.

kendo.syncReady(function(){jQuery(&quot;#CodigoPostal&quot;).kendoComboBox({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetCodigosPostales&quot;,&quot;data&quot;:filterCodigoPostal},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Número sucursal

    
  
  
    
Calle

    
    
Número

    
    
Piso

    
    
Dpto.

    
  

  
  
    
Condición de IVA

IVA Monotributo [6]kendo.syncReady(function(){jQuery(&quot;#CondicionIvaId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Condición de IVA Prueba [8]&quot;,&quot;Value&quot;:&quot;8&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Consumidor Final [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Exento [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Monotributo [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Responsable Inscripto [7]&quot;,&quot;Value&quot;:&quot;7&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Responsable Inscripto-Grandes Contribyentes [29]&quot;,&quot;Value&quot;:&quot;29&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Responsable No Inscripto [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;No Categorizado [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;No Responsable [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});    
    
Condición de IIBB

Contribuyente exento [6]kendo.syncReady(function(){jQuery(&quot;#CondicionIIBBId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;- [29]&quot;,&quot;Value&quot;:&quot;29&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente convenio multilateral [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente exento [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente exento Prueba exterior [7]&quot;,&quot;Value&quot;:&quot;7&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente Local [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente no inscripto [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente Régimen Simplificado [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});    
  



    
    
      
        Contactos
      
    
    
      
         Nuevo ContactoTipoTipo Contacto NombreValorkendo.syncReady(function(){jQuery(&quot;#grdContactos_3&quot;).kendoGrid({&quot;save&quot;:ActualizarContacto,&quot;edit&quot;:ValidarValorTipoContacto,&quot;navigatable&quot;:true,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003e\u003c/span\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap; text-align:center;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Eliminar\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-times\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Eliminar&quot;,&quot;click&quot;:QuitarContacto}]},{&quot;title&quot;:&quot;Tipo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;,&quot;onchange&quot;:&quot;SetTipoContactoNombre(this)&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;300px&quot;,&quot;field&quot;:&quot;TipoContactoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-required=\&quot;The TipoContactoId field is required.\&quot; id=\&quot;TipoContactoId\&quot; name=\&quot;TipoContactoId\&quot; style=\&quot;width:100%; min-width:300px;\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoContactoId\&quot;).kendoDropDownList({\&quot;dataTextField\&quot;:\&quot;Descripcion\&quot;,\&quot;dataValueField\&quot;:\&quot;Id\&quot;,\&quot;optionLabel\&quot;:\&quot;Seleccione\&quot;,\&quot;dataSource\&quot;:{\&quot;transport\&quot;:{\&quot;read\&quot;:{\&quot;url\&quot;:\&quot;/adinsurance/Emision/Gestion/Movimiento/GetTiposContactoByTipoPersona\&quot;,\&quot;data\&quot;:filterTipoPersona},\&quot;prefix\&quot;:\&quot;\&quot;},\&quot;serverFiltering\&quot;:true,\&quot;filter\&quot;:[],\&quot;schema\&quot;:{\&quot;errors\&quot;:\&quot;Errors\&quot;}}});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoContactoId\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;,&quot;values&quot;:[{&quot;text&quot;:&quot;Dirección de sede social&quot;,&quot;value&quot;:&quot;5&quot;},{&quot;text&quot;:&quot;Email&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;text&quot;:&quot;Email póliza electrónica&quot;,&quot;value&quot;:&quot;4&quot;},{&quot;text&quot;:&quot;Fax&quot;,&quot;value&quot;:&quot;8&quot;},{&quot;text&quot;:&quot;Sitio web&quot;,&quot;value&quot;:&quot;3&quot;},{&quot;text&quot;:&quot;Teléfono celular&quot;,&quot;value&quot;:&quot;7&quot;},{&quot;text&quot;:&quot;Teléfono de sede social&quot;,&quot;value&quot;:&quot;6&quot;},{&quot;text&quot;:&quot;Teléfono fijo&quot;,&quot;value&quot;:&quot;2&quot;},{&quot;text&quot;:&quot;tipo contacto&quot;,&quot;value&quot;:&quot;29&quot;}]},{&quot;title&quot;:&quot;Tipo Contacto Nombre&quot;,&quot;hidden&quot;:true,&quot;field&quot;:&quot;TipoContactoNombre&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput id=\&quot;TipoContactoNombre\&quot; name=\&quot;TipoContactoNombre\&quot; style=\&quot;width:100%;\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoContactoNombre\&quot;).kendoTextBox({});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoContactoNombre\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Valor&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;500px&quot;,&quot;field&quot;:&quot;Valor&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput id=\&quot;Valor\&quot; name=\&quot;Valor\&quot; style=\&quot;width:100%;\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#Valor\&quot;).kendoTextBox({});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;Valor\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;}],&quot;scrollable&quot;:false,&quot;editable&quot;:{&quot;confirmation&quot;:false,&quot;confirmDelete&quot;:&quot;¿Desea eliminar este registro?&quot;,&quot;cancelDelete&quot;:&quot;Cancel&quot;,&quot;mode&quot;:&quot;incell&quot;,&quot;create&quot;:true,&quot;update&quot;:true,&quot;destroy&quot;:true,&quot;template&quot;:null},&quot;toolbar&quot;:&quot;\u003cbutton type=\u0027button\u0027 class=\u0027k-button\u0027 onclick=\u0027AgregarContacto()\u0027 title=\u0027Nuevo Contacto\u0027\u003e\u003cspan\u003e\u003ci class=\u0027fa fa-file\u0027\u003e\u003c/i\u003e\u0026nbsp;Nuevo\u0026nbsp;Contacto\u003c/span\u003e\u003c/button\u003e\u003c/div\u003e&quot;,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/CampoEmision/grdPersonaContactos_Read&quot;,&quot;data&quot;:filterPersonaContactos},&quot;prefix&quot;:&quot;&quot;},&quot;error&quot;:grd_ErrorHandler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;TipoContactoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoContactoNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Valor&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});
      
    

</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;datosContent&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='datosContent']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='vistaPersona']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Seleccione'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Copiar desde:'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div[3]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
