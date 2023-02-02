<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_function DefaultCampoEmisionEvent(e)   _bea8e3</name>
   <tag></tag>
   <elementGuidId>32c9c2d2-9c9c-4a57-845e-a909967e1b3d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#datosInmuebleContent</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='datosInmuebleContent']</value>
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
      <value>panel-body panel-collapse collapse in</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>datosInmuebleContent</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Subproducto      
      
  subproducto Katalon - subproduct [5620]kendo.syncReady(function(){jQuery(&quot;#SubProductoIdInmueble_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboSubProductoIdInmueble_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;5620&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetSubProductosByMovimiento&quot;,&quot;data&quot;:filterByMovimiento},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




País      
      
  ARGENTINA [1]kendo.syncReady(function(){jQuery(&quot;#PaisIdInmueble_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboPaisIdInmueble_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;1&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetPaisesEmpresa&quot;,&quot;data&quot;:filterPaisInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Provincia      
      
  CIUDAD AUTÓNOMA DE BUENOS AIRES [1]kendo.syncReady(function(){jQuery(&quot;#ProvinciaIdInmueble_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboProvinciaIdInmueble_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;PaisIdInmueble_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetProvincias&quot;,&quot;data&quot;:filterProvinciaInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    cboLocalidadIdInmueble_databound(e);
  }


  
Localidad      
      
    716kendo.syncReady(function(){jQuery(&quot;#LocalidadIdInmueble_XmlValue&quot;).kendoComboBox({&quot;change&quot;:cboLocalidadIdInmueble_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;autoBind&quot;:true,&quot;cascadeFrom&quot;:&quot;ProvinciaIdInmueble_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetLocalidades&quot;,&quot;data&quot;:filterLocalidadInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});  


      
      
C. P.

kendo.syncReady(function(){jQuery(&quot;#CodigoPostalInmueble&quot;).kendoComboBox({&quot;change&quot;:cboCodigoPostalInmueble_change,&quot;dataBound&quot;:SetDefaultCodigoPostalInmueble,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetCodigosPostales&quot;,&quot;data&quot;:filterCodigoPostalInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});      

      
  
Calle      
      
      


      
  
Altura      
      
      


      
  
Piso      
      
      


      
  
Departamento      
      
      


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Uso bien asegurado      
      
  PARTICULAR - OCUPACION PERMANENTE [4]kendo.syncReady(function(){jQuery(&quot;#UsoBienAseguradoId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboUsoBienAseguradoId_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;SubProductoIdInmueble_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;4&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetUsosBienAsegurado&quot;,&quot;data&quot;:filterByMovimientoAndSubproductoInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Tipo bien asegurado      
      
  Establecimiento [7]kendo.syncReady(function(){jQuery(&quot;#TipoBienAseguradoId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboTipoBienAseguradoId_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;SubProductoIdInmueble_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;7&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposBienAsegurado&quot;,&quot;data&quot;:filterByMovimientoAndSubproductoInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    cboActividadId_databound(e);
  }


  
Actividad      
      
    kendo.syncReady(function(){jQuery(&quot;#ActividadId_XmlValue&quot;).kendoComboBox({&quot;change&quot;:cboActividadId_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;autoBind&quot;:true,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetActividades&quot;,&quot;data&quot;:filterActividadInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});  


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Categoría actividad del inmueble      
      
  Seleccionekendo.syncReady(function(){jQuery(&quot;#CategoriaActividadId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboCategoriaActividadId_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;SubProductoIdInmueble_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetCategorias&quot;,&quot;data&quot;:filterByMovimientoAndSubproductoInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      


      


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Categoría inmuebles      
      
  Seleccionekendo.syncReady(function(){jQuery(&quot;#CategoriaInmuebleId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:cboCategoriaInmuebleId_change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;SubProductoIdInmueble_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/RiesgoInmueble/GetCategoriasInmueble&quot;,&quot;data&quot;:filterByMovimientoAndSubproductoInmueble},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      
  
Mts. cuadrados      
      
    kendo.syncReady(function(){jQuery(&quot;#MetrosCuadrados_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateCampoInmuebles,&quot;decimals&quot;:0,&quot;format&quot;:&quot;#&quot;,&quot;round&quot;:false,&quot;spinners&quot;:false});});  


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Compañía seguro anterior      
      
  Seleccionekendo.syncReady(function(){jQuery(&quot;#CompaniaSeguroAnteriorId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:CompaniaSeguroAnteriorId_Change,&quot;dataBound&quot;:DefaultCampoEmisionDatabound,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetCompaniasSeguro&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#CompaniaSeguroAnteriorId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


      
  
Mantuvo cobertura      
      
    SíNokendo.syncReady(function(){jQuery(&quot;#MantuvoCobertura_BoolValue&quot;).kendoSwitch({&quot;change&quot;:UpdateCampoInmuebles,&quot;checked&quot;:false,&quot;enabled&quot;:true,&quot;messages&quot;:{&quot;checked&quot;:&quot;Sí&quot;,&quot;unchecked&quot;:&quot;No&quot;}});});  


      
  
Descuento      
      
    kendo.syncReady(function(){jQuery(&quot;#Descuento_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateCampoInmuebles,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  


      
  
Observaciones      
      
      

    
    
      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Subproducto      
      
  subproducto Katalon - subproduct


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




País      
      
  ARGENTINA


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Provincia      
      
  -


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    cboLocalidadIdInmueble_databound(e);
  }


  
Localidad      
      
    -  



      
  
Calle      
      
    -  


      
  
Altura      
      
    -  


      
  
Piso      
      
    -  


      
  
Departamento      
      
    -  


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Uso bien asegurado      
      
  PARTICULAR - OCUPACION PERMANENTE


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Tipo bien asegurado      
      
  Establecimiento


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    cboActividadId_databound(e);
  }


  
Actividad      
      
    -  


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Categoría actividad del inmueble      
      
  -


      


      


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Categoría inmuebles      
      
  -


      
  
Mts. cuadrados      
      
    -  


      

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }

  function DefaultCampoEmisionDatabound(e) {
    SetTooltipCampoEmisionList(e);
    DefaultCampoEmisionEvent(e);
  }




Compañía seguro anterior      
      
  -


      
  
Mantuvo cobertura      
      
    No  


      
  
Descuento      
      
    -  


      
  
Observaciones      
      
    -  

    
  </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;datosInmuebleContent&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='datosInmuebleContent']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='datosRiesgoContent']/div/div[3]/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Personas (0)'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Adicionales (1)'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[3]/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
