<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_ Detalle FRANQUICIA este metodo se hace_9cb407</name>
   <tag></tag>
   <elementGuidId>862af12e-5330-42ec-a904-33b5ae79921d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.col-md-12</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='datosRiesgoContent']/div</value>
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
      <value>col-md-12</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>


/*
 Detalle FRANQUICIA: este metodo se hace especifico para permitir distintos comportamientos por ramo
*/

function actualizarDatosDetFranquicia() {
  hideMessage();

  let gridFranquicia = guardarDatosDetFranquicia();
  let jsonRiesgosFranquicia = gridFranquicia.dataSource.data().toJSON();

  $.each(jsonRiesgosFranquicia, function (i, item) {
    //Manejo de campos booleanos
    item.EsBase = item.EsBase ? &quot;1&quot; : &quot;0&quot;;
    item.LlevaDetalleEspecificos = item.LlevaDetalleEspecificos ? &quot;1&quot; : &quot;0&quot;;
    item.ExisteEnOrigen = item.ExisteEnOrigen ? &quot;1&quot; : &quot;0&quot;;
    item.Editable = item.Editable ? &quot;1&quot; : &quot;0&quot;;
  });

  UpdateCampoRiesgo(gridFranquicia, jsonRiesgosFranquicia, null);
}



    Riesgos
  
  
  
 
    Tasas y franquicias automáticas  


    IdCódigoRiesgoSuma aseguradaTasa tarifarioTasa finalPrima  Total: 2.999.999,00   46COBPROBRA PRIVADA47COBPUOBRA PÚBLICA2.999.999,00kendo.syncReady(function(){jQuery(&quot;#grdRiesgo&quot;).kendoGrid({&quot;save&quot;:UpdateRiesgos,&quot;edit&quot;:grdRiesgo_Edit,&quot;dataBound&quot;:grdRiesgo_Databound,&quot;navigatable&quot;:true,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003eNo hay registros\u003c/span\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;RiesgoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Código&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Codigo&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Riesgo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;non-editable-desc&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;footerTemplate&quot;:&quot;Total:&quot;,&quot;field&quot;:&quot;DescripcionRiesgo&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Suma asegurada&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;title&quot;:&quot;Base: #=HideNulls(SumaAseguradaBase)# Tope: #=HideNulls(SumaAseguradaTope)#&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;footerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;footerTemplate&quot;:&quot;\u003cspan id=\u0027spanSumaAsegurada\u0027\u003e #=HideNulls(kendo.toString(sum, \u0027n2\u0027))#\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SumaAsegurada&quot;,&quot;format&quot;:&quot;{0:n2}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;aggregates&quot;:[&quot;sum&quot;],&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-number=\&quot;The field must be a number.\&quot; id=\&quot;SumaAsegurada\&quot; max=\&quot;9999999999999,99\&quot; min=\&quot;0\&quot; name=\&quot;SumaAsegurada\&quot; style=\&quot;width:100%\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#SumaAsegurada\&quot;).kendoNumericTextBox({\&quot;culture\&quot;:\&quot;en-US\&quot;,\&quot;decimals\&quot;:4,\&quot;round\&quot;:false,\&quot;spinners\&quot;:false});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;SumaAsegurada\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Tasa tarifario&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;field&quot;:&quot;TasaTarifario&quot;,&quot;format&quot;:&quot;{0:n4}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tasa final&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;automatico-manual editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;field&quot;:&quot;TasaFinal&quot;,&quot;format&quot;:&quot;{0:n4}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-number=\&quot;The field must be a number.\&quot; id=\&quot;TasaFinal\&quot; max=\&quot;9999999999999,99\&quot; min=\&quot;0\&quot; name=\&quot;TasaFinal\&quot; style=\&quot;width:100%\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TasaFinal\&quot;).kendoNumericTextBox({\&quot;culture\&quot;:\&quot;en-US\&quot;,\&quot;decimals\&quot;:4,\&quot;round\&quot;:false,\&quot;spinners\&quot;:false});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TasaFinal\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Prima&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;footerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;footerTemplate&quot;:&quot;\u003cspan id=\u0027spanPrima\u0027\u003e #=HideNulls(kendo.toString(sum, \u0027n2\u0027))#\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PrimaProrrateada&quot;,&quot;format&quot;:&quot;{0:n2}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;aggregates&quot;:[&quot;sum&quot;]}],&quot;scrollable&quot;:false,&quot;editable&quot;:{&quot;confirmation&quot;:&quot;Are you sure you want to delete this record?&quot;,&quot;confirmDelete&quot;:&quot;Delete&quot;,&quot;cancelDelete&quot;:&quot;Cancel&quot;,&quot;mode&quot;:&quot;incell&quot;,&quot;create&quot;:true,&quot;update&quot;:true,&quot;destroy&quot;:true,&quot;template&quot;:null},&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/CampoEmision/grdRiesgo_Read&quot;,&quot;data&quot;:filterRiesgo},&quot;prefix&quot;:&quot;&quot;},&quot;aggregate&quot;:[{&quot;field&quot;:&quot;SumaAsegurada&quot;,&quot;aggregate&quot;:&quot;sum&quot;},{&quot;field&quot;:&quot;PrimaProrrateada&quot;,&quot;aggregate&quot;:&quot;sum&quot;}],&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;MovimientoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Riesgo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RiesgoId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Codigo&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;DescripcionRiesgo&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;SumaAsegurada&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaBase&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaTope&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TasaFinal&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TasaTarifario&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PrimaProrrateada&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Especifico&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LlevaDetalleEspecificos&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;EsBase&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Editable&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;RiesgoBaseId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Porcentaje&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;OrdenVisualizacion&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ExisteEnOrigen&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;FranquiciaId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TipoFranquiciaId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UnidadFranquiciaValorId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BaseFranquiciaValorId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;UnidadFranquiciaTopeId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BaseFranquiciaTopeId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ValorFranquicia&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TopeMinimoFranquicia&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TopeMaximoFranquicia&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TipoFranquiciaDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UnidadFranquiciaValorDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BaseFranquiciaValorDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UnidadFranquiciaTopeDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;BaseFranquiciaTopeDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});
    Nota: las tasas se consideran en por mil(‰).



  
  
Derecho de emisión
    kendo.syncReady(function(){jQuery(&quot;#DerechoEmision_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateConceptoRiesgo,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  


  
  
Gastos de colegio
    kendo.syncReady(function(){jQuery(&quot;#GastosColegio_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateConceptoRiesgo,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  


  
  
Gastos de escribanía
    kendo.syncReady(function(){jQuery(&quot;#GastosEscribania_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateConceptoRiesgo,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  









function ShowModalFranquiciaRiesgo(grdName, riesgoId) {
  $(&quot;#hdnFranquiciaRiesgoId&quot;).val(riesgoId);
  $(&quot;#hdnFranquiciaGridName&quot;).val(grdName);

  let grid = $(&quot;#&quot; + grdName).data(&quot;kendoGrid&quot;);
  let dataItem = $.grep(grid.dataSource.data(), function (d) {
    return d.RiesgoId == riesgoId;
  });

  if (dataItem.length > 0)
    asignarDatosDetFranquicia(dataItem[0]);

  $('#modalDetalleFranquicia').modal('show');
  $(&quot;#modalDetalleFranquicia&quot;).draggable({
    handle: &quot;.modal-header&quot;
  });
}

function clearDetFranquicia() {
  if ($(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;)) {
    $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
    $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
  }
  else
    $(&quot;#TipoFranquiciaId&quot;).val(null);

  if ($(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;)) {
    $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
    $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
  }
  else
    $(&quot;#UnidadFranquiciaValorId&quot;).val(null);

  if ($(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;)) {
    $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
    $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
  }
  else
    $(&quot;#BaseFranquiciaValorId&quot;).val(null);

  if ($(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;)) {
    $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
    $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
  }
  else
    $(&quot;#UnidadFranquiciaTopeId&quot;).val(null);

  if ($(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;)) {
    $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
    $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
  }
  else
    $(&quot;#BaseFranquiciaTopeId&quot;).val(null);

  if ($(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
    $(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(null);
  else
    $(&quot;#ValorFranquicia&quot;).val(null);

  if ($(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
    $(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(null);
  else
    $(&quot;#TopeMinimoFranquicia&quot;).val(null);

  if ($(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
    $(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(null);
  else
    $(&quot;#TopeMaximoFranquicia&quot;).val(null);
}

function asignarDatosDetFranquicia(dataItem) {
  if (dataItem) {
    if (dataItem.TipoFranquiciaId) {
      if ($(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;))
        $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).value(dataItem.TipoFranquiciaId);
      else
        $(&quot;#TipoFranquiciaId&quot;).text(dataItem.TipoFranquiciaDescripcion);
    }
    else {
      if ($(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;)) {
        $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
        $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
      }
      else
        $(&quot;#TipoFranquiciaId&quot;).val(null);
    }

    if (dataItem.UnidadFranquiciaValorId) {
      if ($(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;))
        $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(dataItem.UnidadFranquiciaValorId);
      else
        $(&quot;#UnidadFranquiciaValorId&quot;).text(dataItem.UnidadFranquiciaValorDescripcion);
    }
    else {
      if ($(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;)) {
        $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
        $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
      }
      else
        $(&quot;#UnidadFranquiciaValorId&quot;).val(null);
    }

    if (dataItem.BaseFranquiciaValorId) {
      if ($(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;))
        $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(dataItem.BaseFranquiciaValorId);
      else
        $(&quot;#BaseFranquiciaValorId&quot;).text(dataItem.BaseFranquiciaValorDescripcion);
    }
    else {
      if ($(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;)) {
        $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
        $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
      }
      else
        $(&quot;#BaseFranquiciaValorId&quot;).val(null);
    }

    if (dataItem.UnidadFranquiciaTopeId) {
      if ($(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;))
        $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(dataItem.UnidadFranquiciaTopeId);
      else
        $(&quot;#UnidadFranquiciaTopeId&quot;).text(dataItem.UnidadFranquiciaTopeDescripcion);
    }
    else {
      if ($(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;)) {
        $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
        $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
      }
      else
        $(&quot;#UnidadFranquiciaTopeId&quot;).val(null);
    }

    if (dataItem.BaseFranquiciaTopeId) {
      if ($(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;))
        $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(dataItem.BaseFranquiciaTopeId);
      else
        $(&quot;#BaseFranquiciaTopeId&quot;).text(dataItem.BaseFranquiciaTopeDescripcion);
    }
    else {
      if ($(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;)) {
        $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(null);
        $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).select(0);
      }
      else
        $(&quot;#BaseFranquiciaTopeId&quot;).val(null);
    }

    if (dataItem.ValorFranquicia) {
      if ($(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
        $(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(dataItem.ValorFranquicia);
      else
        $(&quot;#ValorFranquicia&quot;).text(formatMoney(dataItem.ValorFranquicia));
    }
    else {
      if ($(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
        $(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(null);
      else
        $(&quot;#ValorFranquicia&quot;).val(null);
    }

    if (dataItem.TopeMinimoFranquicia) {
      if ($(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
        $(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(dataItem.TopeMinimoFranquicia);
      else
        $(&quot;#TopeMinimoFranquicia&quot;).text(formatMoney(dataItem.TopeMinimoFranquicia));
    }
    else {
      if ($(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
        $(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(null);
      else
        $(&quot;#TopeMinimoFranquicia&quot;).val(null);
    }

    if (dataItem.TopeMaximoFranquicia) {
      if ($(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
        $(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(dataItem.TopeMaximoFranquicia);
      else
        $(&quot;#TopeMaximoFranquicia&quot;).text(formatMoney(dataItem.TopeMaximoFranquicia));
    }
    else {
      if ($(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;))
        $(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(null);
      else
        $(&quot;#TopeMaximoFranquicia&quot;).val(null);
    }
  }
  else {
    clearDetFranquicia();
  }
}

function guardarDatosDetFranquicia() {
  //Validaciones
  var popUpNotificacion = $(&quot;#popUpFranquiciaNotification&quot;).kendoNotification({ appendTo: &quot;#detFranquiciaBody&quot; }).data(&quot;kendoNotification&quot;);

  var franquicia = {
      TipoFranquiciaId: $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).value(),
      UnidadFranquiciaValorId: $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(),
      BaseFranquiciaValorId: $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value(),
      ValorFranquicia: $(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(),
      UnidadFranquiciaTopeId: $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(),
      BaseFranquiciaTopeId: $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value(),
      TopeMinimoFranquicia: $(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value(),
      TopeMaximoFranquicia: $(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value()
  };

  var errores = &quot;&quot;;

  if (franquicia.TipoFranquiciaId == &quot;&quot; || franquicia.TipoFranquiciaId == null)
      errores = &quot;Debe seleccionar un tipo franquicia.&lt;br/>&quot;;

  if (franquicia.UnidadFranquiciaValorId == &quot;&quot; || franquicia.UnidadFranquiciaValorId == null)
      errores += &quot;Debe seleccionar una unidad de franquicia valor.&lt;br/>&quot;;

  if (franquicia.BaseFranquiciaValorId == &quot;&quot; || franquicia.BaseFranquiciaValorId == null)
      errores += &quot;Debe seleccionar una base de franquicia valor.&lt;br/>&quot;;

  if (franquicia.ValorFranquicia == &quot;&quot; || franquicia.ValorFranquicia == null)
      errores += &quot;Debe ingresar un valor.&lt;br/>&quot;;

  if ((franquicia.TopeMinimoFranquicia != &quot;&quot; &amp;&amp; franquicia.TopeMinimoFranquicia != null)
      &amp;&amp; (franquicia.TopeMaximoFranquicia != &quot;&quot; &amp;&amp; franquicia.TopeMaximoFranquicia != null)
      &amp;&amp; franquicia.TopeMinimoFranquicia > franquicia.TopeMaximoFranquicia)
      errores += &quot;El tope mínimo debe ser menor o igual al tope máximo&quot;;

  if (errores != &quot;&quot;) {
      popUpNotificacion.show(errores, &quot;error&quot;);
      return;
  }

  //Guardado
  let gridName = $(&quot;#hdnFranquiciaGridName&quot;).val();
  let riesgoId = $(&quot;#hdnFranquiciaRiesgoId&quot;).val();

  let grid = $(&quot;#&quot; + gridName).data(&quot;kendoGrid&quot;);
  let dataRiesgos = grid.dataSource.data();
  let dataItem = $.grep(dataRiesgos, function (d) {
    return d.RiesgoId == riesgoId;
  });

  if (dataItem.length > 0) {
    if ($(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;)) {
      dataItem[0].TipoFranquiciaId = $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).value();

      if (dataItem[0].TipoFranquiciaId)
        dataItem[0].TipoFranquiciaDescripcion = $(&quot;#TipoFranquiciaId&quot;).data(&quot;kendoDropDownList&quot;).text();
    }
    if ($(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;)) {
      dataItem[0].UnidadFranquiciaValorId = $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value();

      if (dataItem[0].UnidadFranquiciaValorId)
        dataItem[0].UnidadFranquiciaValorDescripcion = $(&quot;#UnidadFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).text();
    }
    if ($(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;)) {
      dataItem[0].BaseFranquiciaValorId = $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).value();

      if(dataItem[0].BaseFranquiciaValorId)
        dataItem[0].BaseFranquiciaValorDescripcion = $(&quot;#BaseFranquiciaValorId&quot;).data(&quot;kendoDropDownList&quot;).text();
    }
    if ($(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;)) {
      dataItem[0].UnidadFranquiciaTopeId = $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value();

      if(dataItem[0].UnidadFranquiciaTopeId)
        dataItem[0].UnidadFranquiciaTopeDescripcion = $(&quot;#UnidadFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).text();
    }
    if ($(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;)) {
      dataItem[0].BaseFranquiciaTopeId = $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).value();

      if(dataItem[0].BaseFranquiciaTopeId)
        dataItem[0].BaseFranquiciaTopeDescripcion = $(&quot;#BaseFranquiciaTopeId&quot;).data(&quot;kendoDropDownList&quot;).text();
    }
    if ($(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;)) {
      dataItem[0].ValorFranquicia = $(&quot;#ValorFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value();
    }
    if ($(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;)) {
      dataItem[0].TopeMinimoFranquicia = $(&quot;#TopeMinimoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value();
    }
    if ($(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;)) {
      dataItem[0].TopeMaximoFranquicia = $(&quot;#TopeMaximoFranquicia&quot;).data(&quot;kendoNumericTextBox&quot;).value();
    }
  }

  $('#modalDetalleFranquicia').modal('hide');

  return grid;
}










  
    
      
        Franquicia
      
      
        
          
          
          
              
                Tipo Franquicia
                 
                Seleccionekendo.syncReady(function(){jQuery(&quot;#TipoFranquiciaId&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Deducible [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Evento [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Subsiniestro [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false}]});});
              
          
          
              
                Unidad Franquicia Valor
                 
                Seleccionekendo.syncReady(function(){jQuery(&quot;#UnidadFranquiciaValorId&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Monto [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Porcentaje [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});
              
          
          
              
                Base Franquicia Valor
                 
                Seleccionekendo.syncReady(function(){jQuery(&quot;#BaseFranquiciaValorId&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;% sobre Siniestros [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Indemnizacion [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;No Aplica [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Reclamante [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Suma asegurada [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false}]});});
              
          
          
              
                Valor Franquicia
                 
                kendo.syncReady(function(){jQuery(&quot;#ValorFranquicia&quot;).kendoNumericTextBox({&quot;spinners&quot;:false});});
              
          
          
              
                Unidad Franquicia Tope
                Seleccionekendo.syncReady(function(){jQuery(&quot;#UnidadFranquiciaTopeId&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Monto [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Porcentaje [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false}]});});
              
          
          
              
                Base Franquicia Tope
                Seleccionekendo.syncReady(function(){jQuery(&quot;#BaseFranquiciaTopeId&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;Seleccione&quot;,&quot;Value&quot;:&quot;&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;% sobre Siniestros [5]&quot;,&quot;Value&quot;:&quot;5&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Indemnizacion [2]&quot;,&quot;Value&quot;:&quot;2&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;No Aplica [4]&quot;,&quot;Value&quot;:&quot;4&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Reclamante [3]&quot;,&quot;Value&quot;:&quot;3&quot;,&quot;Selected&quot;:false},{&quot;Text&quot;:&quot;Suma asegurada [1]&quot;,&quot;Value&quot;:&quot;1&quot;,&quot;Selected&quot;:false}]});});
              
          
          
              
                Tope Mínimo
                kendo.syncReady(function(){jQuery(&quot;#TopeMinimoFranquicia&quot;).kendoNumericTextBox({&quot;spinners&quot;:false});});
              
          
          
              
                Tope Máximo
                kendo.syncReady(function(){jQuery(&quot;#TopeMaximoFranquicia&quot;).kendoNumericTextBox({&quot;spinners&quot;:false});});
              
          
        
      
      
        Cerrar
        Agregar
      
    
  
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;datosRiesgoContent&quot;)/div[@class=&quot;col-md-12&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='datosRiesgoContent']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Estado: Incompleta'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]/div/div[2]/div</value>
   </webElementXpaths>
</WebElementEntity>
