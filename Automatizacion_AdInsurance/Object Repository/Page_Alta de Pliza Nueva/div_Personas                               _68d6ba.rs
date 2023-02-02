<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Personas                               _68d6ba</name>
   <tag></tag>
   <elementGuidId>12f1d41a-4236-4cc7-8bf5-11c42c02817d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#tblDatosDescriptivos</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='tblDatosDescriptivos']</value>
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
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>row</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>tblDatosDescriptivos</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
              
                

















  
  
  







  
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    

    
    
    
    
  

  
    
      
      
        
            
              
              Personas
            
            
              
              Emisión
            
            
              
              Fechas
            
            
              
              Riesgos
            
            
              
              Propuesta
            
            
              
              Cálculo
            
            
              
              Validaciones
            
            
              
              Datos adicionales
            
            
              
              Anexos y cláusulas
            
            
              
              Coaseguro
            
            
              
              Adjuntos
            
            
              
              Vista previa
            
        
      
      
    

    

      




  




  .k-tabstrip ul li.k-item {
    width: 23%;
    cursor: pointer;
  }




  
    $(document).ready(function () { InitVistaPersona() });
  
  
    
      
        
            
            Personas
        
      
      
        Estado: Incompleta
      
    
  
  
      
        
          
            
                
                  
                
                
                  
                
                
                  
                
                
                  
                
            
          
        
      
      
          
            Copiar desde:
          
          
            Tomadorkendo.syncReady(function(){jQuery(&quot;#RolPersonaOrigenId&quot;).kendoDropDownList({&quot;change&quot;:EnableCopiarPersona,&quot;dataBound&quot;:EnableCopiarPersona,&quot;autoBind&quot;:true,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;0&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetRolesPersonaCopia&quot;,&quot;data&quot;:filterRolActual},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
              
            
          
      
  
  
      



  idTipoPersonaJuridica = 2;
  idTipoPersonaFisica = 1;
  idPaisArgentina = 1;
  idProvinciaCABA = 1;
  idLocalidadCABA = 716;
  idTipoDocCuit = 2;

  function getViewModel() {
      return {
          MovimientoPersonaViewModel: $('form').serializeObject()
      };
  }


  function SetTipoContactoNombre(control) {
    let gridContactos = $(&quot;#grdContactos_&quot; + $(&quot;#RolPersonaId&quot;).val()).data(&quot;kendoGrid&quot;);
    let row = gridContactos.dataItem($(control.parentElement).closest(&quot;tr&quot;));

    row.TipoContactoNombre = $(&quot;#TipoContactoId&quot;).data(&quot;kendoDropDownList&quot;).dataItem().Nombre;
  }

  function filterPersonaContactos() {
    return {
      movimientoId: $(&quot;#Id&quot;).val(),
      rolPersonaId: $(&quot;#hdnRolPersonaId_&quot; + 2).val(),
      tipoDocumentoId: $(&quot;#TipoDocumentoId&quot;).val(),
      numeroDocumento: $(&quot;#NumeroDocumento&quot;).val(),
      tipoPersonaId: $(&quot;#TipoPersonaId&quot;).val(),
      sexoId: $(&quot;#SexoId&quot;).val()
    };
  }


  function ValidarValorTipoContacto(e) {
    let gridContactos = $(&quot;#grdContactos_&quot; + $(&quot;#RolPersonaId&quot;).val()).data(&quot;kendoGrid&quot;);
    let row = gridContactos.dataItem($(e.container).closest(&quot;tr&quot;));

    switch (row.TipoContactoNombre) {
      case 'EmailPolizaElectronica':
      case 'Email':
        $(&quot;#Valor&quot;).attr(&quot;type&quot;, &quot;email&quot;);
        $(&quot;#Valor&quot;).unbind(&quot;keypress&quot;);
        $(&quot;#Valor&quot;).attr(&quot;placeholder&quot;, &quot;Ingrese un email&quot;);
        break;
      case 'TelefonoFijo':
      case 'TelefonoSedeSocial':
      case 'TelefonoCelular':
        $(&quot;#Valor&quot;).attr(&quot;type&quot;, &quot;text&quot;);
        $(&quot;#Valor&quot;).keypress(soloNumeros);
        $(&quot;#Valor&quot;).attr(&quot;placeholder&quot;, &quot;Ingrese numero de telefono (sin letras)&quot;);
        break;
      default:
        $(&quot;#Valor&quot;).attr(&quot;type&quot;, &quot;text&quot;);
        $(&quot;#Valor&quot;).unbind(&quot;keypress&quot;);
        $(&quot;#Valor&quot;).attr(&quot;placeholder&quot;, `Ingrese texto`);
        break;
    }

    SelectTextForEdit();
  }




  
    $(document).ready(function() {
      //chequeo divs por razon social
      ChequearRazonSocial(2, 1);
    });
  



  
    

    
    
  
  
    
Tipo de documento

Codigo Unico de Identificacion Tributaria [2]kendo.syncReady(function(){jQuery(&quot;#TipoDocumentoId&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoDocumento,&quot;dataBound&quot;:SetTipoPersonaDefault,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;2&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetTiposDocumento&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Número de documento

kendo.syncReady(function(){jQuery(&quot;#NumeroDocumento&quot;).kendoTextBox({&quot;value&quot;:&quot;20310657264&quot;});});    
    
Tipo de persona

Persona física [1]kendo.syncReady(function(){jQuery(&quot;#TipoPersonaId&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoPersona,&quot;dataBound&quot;:SetTipoPersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetTiposPersona&quot;,&quot;data&quot;:filterTipoDocumento},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  

  
    
Apellido

    
    
Nombre

    
    
Personería jurídica

Seleccionekendo.syncReady(function(){jQuery(&quot;#PersoneriaJuridicaId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetPersoneriasJuridicas&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  

  
    
Nacionalidad

ARGENTINA [1]kendo.syncReady(function(){jQuery(&quot;#NacionalidadId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARGENTINA [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BRASILERO [8]&quot;,&quot;Value&quot;:&quot;8&quot;,&quot;Selected&quot;:false}]});});    
    
      
Grupo económico

kendo.syncReady(function(){jQuery(&quot;#GrupoEconomicoId&quot;).kendoComboBox({&quot;change&quot;:UpdateGrupoEconomico,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetGruposEconomicos&quot;,&quot;data&quot;:filterGrupoEconomico},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Fecha de nacimiento

kendo.syncReady(function(){jQuery(&quot;#FechaNacimiento&quot;).kendoDatePicker({&quot;change&quot;:UpdatePersona,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;max&quot;:new Date(2020,8,30,0,0,0,0)});});    
    
Sexo

Masculino [M]kendo.syncReady(function(){jQuery(&quot;#SexoId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetSexo&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Estado Civil

Seleccionekendo.syncReady(function(){jQuery(&quot;#EstadoCivilId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Casado/a [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Divorciado/a [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Separado/a [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Soltero/a [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Union de hecho [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Viudo/a [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false}]});});    
  

  
    
      
Actividad / Ocupación

77kendo.syncReady(function(){jQuery(&quot;#OcupacionId&quot;).kendoComboBox({&quot;change&quot;:UpdateOcupacion,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;value&quot;:&quot;77&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetOcupaciones&quot;,&quot;data&quot;:filterOcupacion},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  

  
    
Observaciones

    
    
Persona expuesta políticamente
          
  



  
  
    
Domicilio

Nuevo Domiciliokendo.syncReady(function(){jQuery(&quot;#PersonaDomicilioId&quot;).kendoDropDownList({&quot;change&quot;:SeleccionarPersonaDomicilio,&quot;dataBound&quot;:SetPersonaDomicilio,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;value&quot;:&quot;0&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetDomiciliosPersona&quot;,&quot;data&quot;:filterPersonaDomicilio},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  
  
    
Tipo

Legal [1]kendo.syncReady(function(){jQuery(&quot;#TipoDomicilioId&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoDomicilio,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Legal [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Particular [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Real [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Sucursal [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});    
    
País

ARGENTINA [1]kendo.syncReady(function(){jQuery(&quot;#PaisId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePais,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;AFGANISTAN [89]&quot;,&quot;Value&quot;:&quot;89&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ALEMANIA [10]&quot;,&quot;Value&quot;:&quot;10&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ANGOLA [94]&quot;,&quot;Value&quot;:&quot;94&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ANGUILLA [38]&quot;,&quot;Value&quot;:&quot;38&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ANTIGUA Y BARBUDA [39]&quot;,&quot;Value&quot;:&quot;39&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARABIA SAUDITA [90]&quot;,&quot;Value&quot;:&quot;90&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARGENTINA [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ARUBA [40]&quot;,&quot;Value&quot;:&quot;40&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;AUSTRIA [77]&quot;,&quot;Value&quot;:&quot;77&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BAHAMAS [41]&quot;,&quot;Value&quot;:&quot;41&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BARBADOS [42]&quot;,&quot;Value&quot;:&quot;42&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BELGICA [78]&quot;,&quot;Value&quot;:&quot;78&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BELICE [25]&quot;,&quot;Value&quot;:&quot;25&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BERMUDAS [32]&quot;,&quot;Value&quot;:&quot;32&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BOLIVIA [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BOSNIA-HERZEGOVINA [68]&quot;,&quot;Value&quot;:&quot;68&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;BRASIL [8]&quot;,&quot;Value&quot;:&quot;8&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CANADA [33]&quot;,&quot;Value&quot;:&quot;33&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CHILE [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CHINA [14]&quot;,&quot;Value&quot;:&quot;14&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COLOMBIA [34]&quot;,&quot;Value&quot;:&quot;34&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COREA DEL NORTE [11]&quot;,&quot;Value&quot;:&quot;11&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COREA DEL SUR [84]&quot;,&quot;Value&quot;:&quot;84&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COSTA DE MARFIL [95]&quot;,&quot;Value&quot;:&quot;95&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;COSTA RICA [26]&quot;,&quot;Value&quot;:&quot;26&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CROACIA [80]&quot;,&quot;Value&quot;:&quot;80&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CUBA [43]&quot;,&quot;Value&quot;:&quot;43&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;CURACAO [44]&quot;,&quot;Value&quot;:&quot;44&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;DOMINICA [45]&quot;,&quot;Value&quot;:&quot;45&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;DOMINICANA, REPUBLICA [46]&quot;,&quot;Value&quot;:&quot;46&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ECUADOR [20]&quot;,&quot;Value&quot;:&quot;20&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EE.UU. [19]&quot;,&quot;Value&quot;:&quot;19&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EGIPTO [96]&quot;,&quot;Value&quot;:&quot;96&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EL SALVADOR [27]&quot;,&quot;Value&quot;:&quot;27&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ESPAÑA [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ETIOPIA [69]&quot;,&quot;Value&quot;:&quot;69&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;EXTERIOR (Migración) [121]&quot;,&quot;Value&quot;:&quot;121&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;FRANCIA [12]&quot;,&quot;Value&quot;:&quot;12&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GRANADA [47]&quot;,&quot;Value&quot;:&quot;47&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GRECIA [81]&quot;,&quot;Value&quot;:&quot;81&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUADALUPE [48]&quot;,&quot;Value&quot;:&quot;48&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUATEMALA [28]&quot;,&quot;Value&quot;:&quot;28&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUAYANA FRANCESA [21]&quot;,&quot;Value&quot;:&quot;21&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;GUYANA [22]&quot;,&quot;Value&quot;:&quot;22&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;HAITI [49]&quot;,&quot;Value&quot;:&quot;49&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;HONDURAS [29]&quot;,&quot;Value&quot;:&quot;29&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IRAN [65]&quot;,&quot;Value&quot;:&quot;65&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IRAQ [70]&quot;,&quot;Value&quot;:&quot;70&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IRLANDA [82]&quot;,&quot;Value&quot;:&quot;82&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS CAIMAN [50]&quot;,&quot;Value&quot;:&quot;50&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS TURCAS Y CAICOS [51]&quot;,&quot;Value&quot;:&quot;51&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS VIRGENES AMERICANAS [52]&quot;,&quot;Value&quot;:&quot;52&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ISLAS VIRGENES BRITÁNICAS [53]&quot;,&quot;Value&quot;:&quot;53&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;ITALIA [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;JAMAICA [54]&quot;,&quot;Value&quot;:&quot;54&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;JAPON [13]&quot;,&quot;Value&quot;:&quot;13&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;LIBANO [17]&quot;,&quot;Value&quot;:&quot;17&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;LIBIA [86]&quot;,&quot;Value&quot;:&quot;86&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MARRUECOS [97]&quot;,&quot;Value&quot;:&quot;97&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MARTINICA [55]&quot;,&quot;Value&quot;:&quot;55&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MEXICO [36]&quot;,&quot;Value&quot;:&quot;36&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MONTSERRAT [56]&quot;,&quot;Value&quot;:&quot;56&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;MYANMAR, BIRMANIA [35]&quot;,&quot;Value&quot;:&quot;35&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;NICARAGUA [30]&quot;,&quot;Value&quot;:&quot;30&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;NIGERIA [98]&quot;,&quot;Value&quot;:&quot;98&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;OTROS PAÍSES DE AFRICA [64]&quot;,&quot;Value&quot;:&quot;64&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;OTROS PAISES DE ASIA [73]&quot;,&quot;Value&quot;:&quot;73&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;OTROS PAISES DE EUROPA [79]&quot;,&quot;Value&quot;:&quot;79&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PAISES BAJOS, HOLANDA [83]&quot;,&quot;Value&quot;:&quot;83&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PAKISTAN [71]&quot;,&quot;Value&quot;:&quot;71&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PANAMA [31]&quot;,&quot;Value&quot;:&quot;31&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PARAGUAY [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PERU [7]&quot;,&quot;Value&quot;:&quot;7&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;POLONIA [9]&quot;,&quot;Value&quot;:&quot;9&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;PUERTO RICO [57]&quot;,&quot;Value&quot;:&quot;57&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;REINO UNIDO [85]&quot;,&quot;Value&quot;:&quot;85&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;REPUBLICA DEL CONGO [76]&quot;,&quot;Value&quot;:&quot;76&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;REPUBLICA DEMOCRATICA DEL CONGO\&quot; [75]&quot;,&quot;Value&quot;:&quot;75&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;RUSIA [91]&quot;,&quot;Value&quot;:&quot;91&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAINT MAARTEN [62]&quot;,&quot;Value&quot;:&quot;62&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN BARTOLOME [58]&quot;,&quot;Value&quot;:&quot;58&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN CRISTOBAL Y NEVIS [59]&quot;,&quot;Value&quot;:&quot;59&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN PEDRO Y MIQUELON [37]&quot;,&quot;Value&quot;:&quot;37&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SAN VICENTE Y LAS GRANADINAS [60]&quot;,&quot;Value&quot;:&quot;60&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SANTA LUCIA [61]&quot;,&quot;Value&quot;:&quot;61&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SERBIA [72]&quot;,&quot;Value&quot;:&quot;72&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SIRIA [16]&quot;,&quot;Value&quot;:&quot;16&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SUDAN [66]&quot;,&quot;Value&quot;:&quot;66&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SUDAN DEL SUR [67]&quot;,&quot;Value&quot;:&quot;67&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SUIZA [87]&quot;,&quot;Value&quot;:&quot;87&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;SURINAM [23]&quot;,&quot;Value&quot;:&quot;23&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TAIWAN [15]&quot;,&quot;Value&quot;:&quot;15&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TRINIDAD Y TOBAGO [63]&quot;,&quot;Value&quot;:&quot;63&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TUNEZ [74]&quot;,&quot;Value&quot;:&quot;74&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;TURQUIA [92]&quot;,&quot;Value&quot;:&quot;92&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;UCRANIA [88]&quot;,&quot;Value&quot;:&quot;88&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;URUGUAY [24]&quot;,&quot;Value&quot;:&quot;24&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;VENEZUELA [18]&quot;,&quot;Value&quot;:&quot;18&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;VIETNAM [93]&quot;,&quot;Value&quot;:&quot;93&quot;,&quot;Selected&quot;:false}]});});    
    
Provincia

CIUDAD AUTÓNOMA DE BUENOS AIRES [1]kendo.syncReady(function(){jQuery(&quot;#ProvinciaId&quot;).kendoDropDownList({&quot;change&quot;:UpdateProvincia,&quot;dataBound&quot;:ChequearEnabledPaisProvincia,&quot;autoBind&quot;:false,&quot;cascadeFrom&quot;:&quot;PaisId&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:false,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetProvincias&quot;,&quot;data&quot;:filterProvincia},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
  
  
    
      
Localidad

716kendo.syncReady(function(){jQuery(&quot;#LocalidadId&quot;).kendoComboBox({&quot;change&quot;:UpdateLocalidad,&quot;dataBound&quot;:ChequearEnabledPaisLocalidad,&quot;autoBind&quot;:false,&quot;cascadeFrom&quot;:&quot;ProvinciaId&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:false,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;value&quot;:&quot;716&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetLocalidades&quot;,&quot;data&quot;:filterLocalidad},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
C. P.

kendo.syncReady(function(){jQuery(&quot;#CodigoPostal&quot;).kendoComboBox({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;value&quot;:&quot;1000&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetCodigosPostales&quot;,&quot;data&quot;:filterCodigoPostal},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    
    
Número sucursal

    
  
  
    
Calle

    
    
Número

    
    
Piso

    
    
Dpto.

    
  

  
  
    
Condición de IVA

IVA Monotributo [6]kendo.syncReady(function(){jQuery(&quot;#CondicionIvaId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;value&quot;:&quot;6&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Condición de IVA Prueba [8]&quot;,&quot;Value&quot;:&quot;8&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Consumidor Final [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Exento [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Monotributo [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Responsable Inscripto [7]&quot;,&quot;Value&quot;:&quot;7&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Responsable Inscripto-Grandes Contribyentes [29]&quot;,&quot;Value&quot;:&quot;29&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;IVA Responsable No Inscripto [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;No Categorizado [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;No Responsable [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});    
    
Condición de IIBB

Contribuyente Local [4]kendo.syncReady(function(){jQuery(&quot;#CondicionIIBBId&quot;).kendoDropDownList({&quot;change&quot;:UpdatePersona,&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;value&quot;:&quot;4&quot;,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;- [29]&quot;,&quot;Value&quot;:&quot;29&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente convenio multilateral [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente exento [6]&quot;,&quot;Value&quot;:&quot;6&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente exento Prueba exterior [7]&quot;,&quot;Value&quot;:&quot;7&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente Local [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente no inscripto [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Contribuyente Régimen Simplificado [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});    
  



    
    
      
        Contactos
      
    
    
      
         Nuevo ContactoTipoTipo Contacto NombreValorkendo.syncReady(function(){jQuery(&quot;#grdContactos_2&quot;).kendoGrid({&quot;save&quot;:ActualizarContacto,&quot;edit&quot;:ValidarValorTipoContacto,&quot;navigatable&quot;:true,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003e\u003c/span\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap; text-align:center;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Eliminar\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-times\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Eliminar&quot;,&quot;click&quot;:QuitarContacto}]},{&quot;title&quot;:&quot;Tipo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;,&quot;onchange&quot;:&quot;SetTipoContactoNombre(this)&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;300px&quot;,&quot;field&quot;:&quot;TipoContactoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-required=\&quot;The TipoContactoId field is required.\&quot; id=\&quot;TipoContactoId\&quot; name=\&quot;TipoContactoId\&quot; style=\&quot;width:100%; min-width:300px;\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoContactoId\&quot;).kendoDropDownList({\&quot;dataTextField\&quot;:\&quot;Descripcion\&quot;,\&quot;dataValueField\&quot;:\&quot;Id\&quot;,\&quot;optionLabel\&quot;:\&quot;Seleccione\&quot;,\&quot;dataSource\&quot;:{\&quot;transport\&quot;:{\&quot;read\&quot;:{\&quot;url\&quot;:\&quot;/adinsurance/Emision/Gestion/Movimiento/GetTiposContactoByTipoPersona\&quot;,\&quot;data\&quot;:filterTipoPersona},\&quot;prefix\&quot;:\&quot;\&quot;},\&quot;serverFiltering\&quot;:true,\&quot;filter\&quot;:[],\&quot;schema\&quot;:{\&quot;errors\&quot;:\&quot;Errors\&quot;}}});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoContactoId\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;,&quot;values&quot;:[{&quot;text&quot;:&quot;Dirección de sede social&quot;,&quot;value&quot;:&quot;5&quot;},{&quot;text&quot;:&quot;Email&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;text&quot;:&quot;Email póliza electrónica&quot;,&quot;value&quot;:&quot;4&quot;},{&quot;text&quot;:&quot;Fax&quot;,&quot;value&quot;:&quot;8&quot;},{&quot;text&quot;:&quot;Sitio web&quot;,&quot;value&quot;:&quot;3&quot;},{&quot;text&quot;:&quot;Teléfono celular&quot;,&quot;value&quot;:&quot;7&quot;},{&quot;text&quot;:&quot;Teléfono de sede social&quot;,&quot;value&quot;:&quot;6&quot;},{&quot;text&quot;:&quot;Teléfono fijo&quot;,&quot;value&quot;:&quot;2&quot;},{&quot;text&quot;:&quot;tipo contacto&quot;,&quot;value&quot;:&quot;29&quot;}]},{&quot;title&quot;:&quot;Tipo Contacto Nombre&quot;,&quot;hidden&quot;:true,&quot;field&quot;:&quot;TipoContactoNombre&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput id=\&quot;TipoContactoNombre\&quot; name=\&quot;TipoContactoNombre\&quot; style=\&quot;width:100%;\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoContactoNombre\&quot;).kendoTextBox({});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoContactoNombre\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Valor&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;500px&quot;,&quot;field&quot;:&quot;Valor&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput id=\&quot;Valor\&quot; name=\&quot;Valor\&quot; style=\&quot;width:100%;\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#Valor\&quot;).kendoTextBox({});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;Valor\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;}],&quot;scrollable&quot;:false,&quot;editable&quot;:{&quot;confirmation&quot;:false,&quot;confirmDelete&quot;:&quot;¿Desea eliminar este registro?&quot;,&quot;cancelDelete&quot;:&quot;Cancel&quot;,&quot;mode&quot;:&quot;incell&quot;,&quot;create&quot;:true,&quot;update&quot;:true,&quot;destroy&quot;:true,&quot;template&quot;:null},&quot;toolbar&quot;:&quot;\u003cbutton type=\u0027button\u0027 class=\u0027k-button\u0027 onclick=\u0027AgregarContacto()\u0027 title=\u0027Nuevo Contacto\u0027\u003e\u003cspan\u003e\u003ci class=\u0027fa fa-file\u0027\u003e\u003c/i\u003e\u0026nbsp;Nuevo\u0026nbsp;Contacto\u003c/span\u003e\u003c/button\u003e\u003c/div\u003e&quot;,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/CampoEmision/grdPersonaContactos_Read&quot;,&quot;data&quot;:filterPersonaContactos},&quot;prefix&quot;:&quot;&quot;},&quot;error&quot;:grd_ErrorHandler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;TipoContactoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoContactoNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Valor&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});
      
    






  

    
      
        ×
        Selección de persona
      

      

        
          
            IdDocumentoSexoNombreFecha Nac.No se encontraron registros con el criterio de búsqueda ingresado.0No hay registros.kendo.syncReady(function(){jQuery(&quot;#grdSeleccion&quot;).kendoGrid({&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan class=\u0027no-records-text\u0027\u003eNo se encontraron registros con el criterio de búsqueda ingresado.\u003cspan\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Seleccionar\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-check-circle\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Seleccionar&quot;,&quot;click&quot;:SeleccionarPersona}]},{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: right;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Id&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Documento&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot;#= armarListaDocumentos(PersonaDocumentos) #&quot;,&quot;field&quot;:&quot;PersonaDocumentos&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Sexo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot; #= Sexo ? Sexo.Descripcion : \u0027Sin Especificar\u0027 # &quot;,&quot;field&quot;:&quot;Sexo.Descripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Nombre&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align:left;&quot;},&quot;template&quot;:&quot;\u003ctext\u003e#= GetDescripcionPersona(data) #\u003c/text\u003e&quot;},{&quot;title&quot;:&quot;Fecha Nac.&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;field&quot;:&quot;FechaNacimiento&quot;,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;buttonCount&quot;:10},&quot;scrollable&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/CampoEmision/grdSeleccionPersona_Read?tipoDocumentoId=2\u0026numeroDocumento=20310657264&quot;,&quot;data&quot;:getViewModel},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:5,&quot;page&quot;:1,&quot;groupPaging&quot;:false,&quot;total&quot;:0,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;Id&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EmpresaId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Empresa&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;TipoPersonaId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoPersona&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;ApellidoRazonSocial&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Nombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NacionalidadId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Nacionalidad&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;SexoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Sexo&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersoneriaJuridicaId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PersoneriaJuridica&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;FechaNacimiento&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;EstadoCivilId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;EstadoCivil&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;OcupacionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Ocupacion&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;CondicionIvaId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CondicionIva&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;GrupoEconomicoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;GrupoEconomico&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;GrupoAdjuntoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;GrupoAdjunto&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;Observaciones&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PersonaExpuestaPoliticamente&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;CodigoExterno&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PersonaDomicilios&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaContactos&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaCondicionIIBB&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaRelaciones&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonasRelacionadas&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaDocumentos&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaExclusionImpuestos&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;ClearListDomicilios&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListContactos&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListRelacionadas&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListIIBB&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListExclusionImpuesto&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;UsuarioInsert&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FechaInsert&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;UsuarioUpdate&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FechaUpdate&quot;:{&quot;type&quot;:&quot;date&quot;}}}}}});});
          
        
      
      
      
    
  




  


      
        
          
              Prima comercial:  
              $ 0,00
          
          
              Premio:  
              $ 0,00
          
          
              Valor de cuota:  
              $ 0,00
          
        
      

    
  



  
  
    

      
        
          ×
          Validaciones
        

        

          
            
              IdItem IdValidacion Id MensajeNo hay registroskendo.syncReady(function(){jQuery(&quot;#grdModalValidaciones&quot;).kendoGrid({&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003eNo hay registros\u003c/span\u003e&quot;},&quot;columns&quot;:[{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Id&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Item Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ItemId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Validacion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ValidacionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot; &quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;width&quot;:&quot;40px&quot;,&quot;template&quot;:&quot;\u003cimg src=\u0027/adinsurance/Emision/assets/icons/validaciones/#=Icono #\u0027 alt=\u0027#=TipoValidacionNombre #\u0027 Title=\u0027#=TipoValidacionNombre #\u0027/\u003e&quot;,&quot;field&quot;:&quot;Icono&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Mensaje&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot;\u003cspan title=\u0027Nombre: #=ValidacionNombre #\n\nDescripción: #=Descripcion #\n\nTipo: #=TipoValidacionNombre #\n\n#=HideIfNull(\&quot;Suscriptores: \&quot;,\&quot;\&quot;,SuscriptoresCompleto) #\n\n#=HideIfNull(\&quot;Datos: \&quot;,\&quot;\&quot;,Datos) #\n\nEstado: #=EstadoValidacionDescripcion #\u0027\u003e#=Mensaje #\u003c/span\u003e&quot;,&quot;field&quot;:&quot;Mensaje&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true}],&quot;scrollable&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;MovimientoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;ModoPreview&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;SolapaTitulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SolapaIcono&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Id&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ItemId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ValidacionId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;},&quot;ValidacionNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Mensaje&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;Datos&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Suscriptores&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SuscriptoresCompleto&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TipoValidacionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoValidacionNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Icono&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;EstadoValidacionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EstadoValidacionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Ignorar&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ValidacionAprobada&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Bitacora&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Bitacora_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Bitacora_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EquipoDistribucionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;EquipoDistribucionId_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EquipoDistribucionId_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EquipoDistribucionId_Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId_Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});
            
          
        
        
          Cerrar
        
      
    
  


  
  
    
      
        
          ×
          Indique motivo
        

        

          
            
          

          
            
              
                Motivo 
                Seleccionekendo.syncReady(function(){jQuery(&quot;#cboEstadoCotizacionMotivo&quot;).kendoDropDownList({&quot;change&quot;:cboEstadoCotizacionMotivo_change,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetMotivosCotizacionRechazo&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#cboEstadoCotizacionMotivo&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
            
            
              
                Mails a notificar (opcional)
                kendo.syncReady(function(){jQuery(&quot;#txtMailNotificacion&quot;).kendoTextBox({});});
              
            
            
              
                Observaciones a incluir en la notificación (opcional)
                
              
            
          
        
        
          Aceptar
        
      
    
  

  







                
              
            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;tblDatosDescriptivos&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='tblDatosDescriptivos']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='admin'])[2]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Usuario del movimiento'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[6]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='descContainer']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='tblDatosDescriptivos']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='admin'])[2]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Usuario del movimiento'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[6]/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='descContainer']/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='admin'])[2]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Usuario del movimiento'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[6]/div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
