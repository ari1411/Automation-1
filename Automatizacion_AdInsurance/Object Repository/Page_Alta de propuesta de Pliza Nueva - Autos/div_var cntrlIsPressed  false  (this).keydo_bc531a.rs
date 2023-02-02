<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_var cntrlIsPressed  false  (this).keydo_bc531a</name>
   <tag></tag>
   <elementGuidId>5ef9ce2b-ed94-45c9-a196-8ab4273dad1c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form/div[2]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.wrapper</value>
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
      <value>wrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
      
      

      















  var cntrlIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
  });

  $(this).mousedown(function (evt) {

    if (!evt) evt = event;

    if (evt.which == 2) {
      cntrlIsPressed = true;
    }
  });

  function customOpenMenu(url) {
    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
  }


  var urlUpdatePerfilUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/UpdatePerfilUsuario';
  var urlGetDatosPerfilUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetDatosPerfilUsuario';
  var urlGetDatosSesionUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetDatosSesionUsuario';
  var urlGetEmpresaDescripcionUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetEmpresaDescripcionUsuario';
  var urlGetEmpresaUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetEmpresaUsuario';
  var urlGetUnidadOperativaUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetUnidadOperativaUsuario';
  var urlGetSucursalUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetSucursalUsuario';
  var urlGetCentroAtencionUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetCentroAtencionUsuario';


  function cbonavheader_close(e) {
    $(&quot;#liPerfilUsuario&quot;).data(&quot;canClose&quot;, false);
  }

  $(document).ready(function ()
  {
    navheader_GetEmpresaDescripcionUsuario();
    navheader_SetDatosSesion();

    //$(&quot;.cboPerfilUsuario&quot;).on(&quot;change&quot;, function (e) {
    //  $(&quot;#liPerfilUsuario&quot;).data(&quot;canClose&quot;, false);
    //});

    $(&quot;#liPerfilUsuario&quot;).on({
      &quot;shown.bs.dropdown&quot;: function () {
        $(&quot;#menuPerfilUsuario&quot;).addClass('stay-open');
      },
      &quot;click&quot;: function () { return !$(&quot;#menuPerfilUsuario&quot;).hasClass('stay-open'); },
      &quot;hide.bs.dropdown&quot;: function (e) {
        if ($('#liPerfilUsuario').data('canClose') == false) {
          e.preventDefault();
          $('#liPerfilUsuario').data('canClose', true);
        } else {
          //Al cerrar refresco el valor de Empresa para reiniciar los valores de combos
          navheader_GetDatoUsuario(urlGetEmpresaUsuario, $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;));

          $(&quot;#menuPerfilUsuario&quot;).removeClass('stay-open');
        }
      }
      });
  });


  const
    navheader_cboEmpresa_databound = (e) => {
      navheader_GetDatoUsuario(urlGetEmpresaUsuario, e.sender);
    },
    navheader_cboEmpresa_change = (e) => {
      navheader_refreshChildCbo(e.sender, $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;));
      navheader_refreshChildCbo(null, $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;));
      navheader_refreshChildCbo(null, $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;));
    },

    navheader_cboUnidadOperativa_databound = (e) => {
      navheader_GetDatoUsuario(urlGetUnidadOperativaUsuario, e.sender);
    },
    navheader_cboUnidadOperativa_change = (e) => {
      navheader_refreshChildCbo(e.sender, $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;));
      navheader_refreshChildCbo(null, $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;));
    },
    navheader_filterUnidadOperativa = () => {
      let empresaId = $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value();
      return { empresaId: empresaId };
    },

    navheader_cboSucursal_databound = (e) => {
      navheader_GetDatoUsuario(urlGetSucursalUsuario, e.sender);
    },
    navheader_cboSucursal_change = (e) => {
      navheader_refreshChildCbo(e.sender, $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;));
    },
    navheader_filterSucursal = () => {
      let unidadOperativaId = $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;).value();
      return { unidadOperativaId: unidadOperativaId };
    },

    navheader_cboCentroAtencion_databound = (e) => {
      navheader_GetDatoUsuario(urlGetCentroAtencionUsuario, e.sender);
    },
    navheader_filterCentroAtencion = () => {
      let sucursalId = $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;).value();
      return { sucursalId: sucursalId };
    },

    navheader_refreshChildCbo = (cboParent, cboChild) => {
      if (cboParent &amp;&amp; cboParent.value()) {        
        $(cboChild).attr('setDefaultValue', true);
        cboChild.dataSource.read();
      }
      else {
        cboChild.value(null);
        cboChild.dataSource.data([]);
      }
    },
    navheader_CerrarPerfilUsuario = () => {
      $(&quot;#menuPerfilUsuario&quot;).removeClass('stay-open');
    },
    navheader_GetEmpresaDescripcionUsuario = () => {
      $.ajax({
        url: urlGetEmpresaDescripcionUsuario,
        datatype: &quot;json&quot;,
        success: function (response) {
          $(&quot;#spanEmpresaDescripcion&quot;).text(response);
        },
        error: function (response) {
          adin_modal_simple(&quot;Error al obtener datos de usuario:&quot; + response.responseJSON.toString());
        }
      });
    },
    navheader_GetDatoUsuario = (url, cbo) => {
      let setDefaultValue = $(cbo).attr('setDefaultValue');
      if (setDefaultValue &amp;&amp; cbo.items().length == 1) {
        cbo.select(1);
        cbo.trigger('change');
      }
      else {
        $.ajax({
          url: url,
          datatype: &quot;json&quot;,
          success: function (response) {
            if (response) {
              cbo.value(response);
              cbo.trigger('change');
            }
            else {
              cbo.value(null);
            }
          },
          error: function (response) {
            adin_modal_simple(&quot;Error al obtener datos de usuario:&quot; + response.responseJSON.toString());
          }
        });
      }

      $(cbo).attr('setDefaultValue', false);
    },
    navheader_SetDatosUsuario = () => {
      $.ajax({
        url: urlGetDatosPerfilUsuario,
        datatype: &quot;json&quot;,
        success: function (response) {
          $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value(response.EmpresaId);
          $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;).value(response.UnidadOperativaId);
          $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;).value(response.SucursalId);
          $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;).value(response.CentroAtencionId);
        },
        error: function (response) {
          adin_modal_simple(&quot;Error al obtener datos de usuario:&quot; + response.responseJSON.toString());
        }
      });
    },
    navheader_SetDatosSesion = () => {
      var params = {
        sistemaId: 2,
      };

      $.ajax({
        url: urlGetDatosSesionUsuario,
        datatype: &quot;json&quot;,
        data: params,
        success: function (response) {
          $(&quot;#spanSesionId&quot;).text('Sesión: ' + response.SesionId);
          $(&quot;#spanFechaIngreso&quot;).text('Último ingreso: ' + kendo.toString(kendo.parseDate(response.FechaIngreso), 'dd/MM/yyyy HH:mm:ss'));
          
          if (response.FechaIngresoAnterior)
            $(&quot;#spanFechaIngresoAnterior&quot;).text('Ingreso anterior: ' + kendo.toString(kendo.parseDate(response.FechaIngresoAnterior), 'dd/MM/yyyy HH:mm:ss'));
          else
            $(&quot;#spanFechaIngresoAnterior&quot;).text('Ingreso anterior: -');
        },
        error: function (response) {
          adin_modal_simple(&quot;Error al obtener datos de sesión:&quot; + response.responseJSON.toString());
        }
      });
    },
    navheader_UpdatePerfilUsuario = () => {
      let empresaId = $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value(),
        unidadOperativaId = $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;).value(),
        sucursalId = $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;).value(),
        centroAtencionId = $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;).value();

      if (!empresaId)
        adin_modal_simple('No se puede actualizar el perfil de usuario: Debe seleccionar una empresa.');
      else if (!unidadOperativaId)
        adin_modal_simple('No se puede actualizar el perfil de usuario: Debe seleccionar una unidad operativa.');
      else if (!sucursalId)
        adin_modal_simple('No se puede actualizar el perfil de usuario: Debe seleccionar una sucursal.');
      else {
        adin_modal_overlay(&quot;Actualizando perfil. Por favor espere...&quot;, true);

        var params = {
          empresaId: empresaId,
          unidadOperativaId: unidadOperativaId,
          sucursalId: sucursalId,
          centroAtencionId: centroAtencionId,
        };

        $.ajax({
          url: urlUpdatePerfilUsuario,
          datatype: &quot;json&quot;,
          data: params,
          success: function (response) {
            window.location.reload();
          },
          error: function (response) {
            adin_modal_overlay(null, false);
            adin_modal_simple(&quot;Error al actualizar perfil de usuario:&quot; + response.responseJSON.toString());
          }
        });
      };
    }



  
  
    
    
      
      AdInsurance
    
    
    
      
      AdInsurance
    
  
  
  
    
    
      
    
    
      
        
        
          
            1.10.2.2181
          
          
            
            
              
                Aplicación:
              
              
                01.10.002
              
              
                Modelo de datos:
              
              
                01.10.002
              
            
          
        
        
        
          
            
            Emisión
          
          
                
                  Cobranzas
                
                
                  General
                
                
                  Impresión
                
                
                  Inspecciones
                
                
                  Portal productores
                
                
                  Reaseguros
                
                
                  Reportes
                
                
                  Siniestros
                
          
        

        
          
            
              
              Meridional Seguros
            
            
              
              
                Empresa
                Meridional Seguros [1]kendo.syncReady(function(){jQuery(&quot;#cboEmpresa&quot;).kendoDropDownList({&quot;change&quot;:navheader_cboEmpresa_change,&quot;dataBound&quot;:navheader_cboEmpresa_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetEmpresas&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                Unidad operativa
                La Meridional [1]kendo.syncReady(function(){jQuery(&quot;#cboUnidadOperativa&quot;).kendoDropDownList({&quot;change&quot;:navheader_cboUnidadOperativa_change,&quot;dataBound&quot;:navheader_cboUnidadOperativa_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetUnidadesOperativas&quot;,&quot;data&quot;:navheader_filterUnidadOperativa},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                Sucursal
                Casa Central [1]kendo.syncReady(function(){jQuery(&quot;#cboSucursal&quot;).kendoDropDownList({&quot;change&quot;:navheader_cboSucursal_change,&quot;dataBound&quot;:navheader_cboSucursal_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetSucursales&quot;,&quot;data&quot;:navheader_filterSucursal},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                Centro de atención
                Telefónica [1]kendo.syncReady(function(){jQuery(&quot;#cboCentroAtencion&quot;).kendoDropDownList({&quot;dataBound&quot;:navheader_cboCentroAtencion_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetCentrosAtencion&quot;,&quot;data&quot;:navheader_filterCentroAtencion},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                
                  
                     Guardar
                  
                
              
            
          
          
            
              
              Usuario Administrador
            
            
              
                
                
                Administrador, Usuario
                admin
                noreply@emmsa.net
                
                Sesión: 661980
                Último ingreso: 12/08/2021 14:34:03
                Ingreso anterior: 12/08/2021 14:27:17
              
              
              
                
                  
                     Cerrar sesión
                  
                
              
            
          
      
    
  




  
  
    
    
      
        
      
      
        Usuario Administrador
        admin
      
    

    
    
      CONTENIDO



    
      
          Gestión
        
          
        
      

      
        


    
      
          Consulta de movimientos
      
    
    
      
          Gestor de suscripción
      
    
    
      
          Tomadores
      
    
    
      
          Proceso Masivo
      
    
    
      
          Consulta de propuestas
      
    
    
      
          Propuestas en espera
      
    
    
      
          Propuestas aceptadas
      
    
    
      
          Propuestas ingresadas
      
    
    
      
          Monitor de distribución
      
    
    
      
          Periodo de Cierre
      
    
    
      
          Reserva de numerador
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Infraestructura
        
          
        
      

      
        


    
      
          Configuración del sistema   
        
          
        
      

      
        


    
      
          Campos de emisión
      
    
    
      
          Clases de nodo
      
    
    
      
          Conceptos
      
    
    
      
          Estados de cotización
      
    
    
      
          Origen Fecha Proceso
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Configuración General
        
          
        
      

      
        


    
      
          Atributos
      
    
    
      
          Proceso Negocio
      
    
    
      
          Tipo Doc. Cond. Fiscal
      
    
    
      
          Tipos de nodo
      
    
    
      
          Validaciones
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Emisión
        
          
        
      

      
        


    
      
          Ramos
      
    
    
      
          Subramos
      
    
    
      
          Riesgos
      
    
    
      
          Específico
      
    
    
      
          Vigencias de contrato
      
    
    
      
          Planes comerciales
      
    
    
      
          Actividades
      
    
    
      
          Categorías SSN
      
    
    
      
          Medidas de prestación
      
    
    
      
          Productos
      
    
    
      
          Uso Bien Asegurado
      
    
    
      
          Tipo Bien Asegurado
      
    
    
      
          Grupo de Afinidad
      
    
    
      
          Rol Persona
      
    
    
      
          Motivo Excepción Inspección
      
    
    
      
          Riesgo Adicional
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Propuestas
        
          
        
      

      
        


    
      
          Datos de propuesta
      
    
    
      
          Alcance de datos de propuesta
      
    
    
      
          Equipos de distribución
      
    
    
      
          Reglas de distribución
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Tarifarios
        
          
        
      

      
        


    
      
          AP - Descuento
      
    
    
      
          AP - Tasas
      
    
    
      
          Caucion Tasas
      
    
    
      
          Ramas Simples - Tasas
      
    
    
      
          Recargo Financiero
      
    
    
      
          Tarifario Transporte
        
          
        
      

      
        


    
      
          Tarifario transporte tasa
      
    
    
      
          Tarifario transporte custodia
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Tarifario Vehículos
        
          
        
      

      
        


    
      
          Tarifario Vehículos Accesorio
      
    
    
      
          Tarifario Vehículos Adicional
      
    
    
      
          Tarifario Vehículos Beneficio
      
    
    
      
          Tarifario Vehículos Descuento Flota
      
    
    
      
          Tarifario Vehículos Region
      
    
    
      
          Tarifario Vehículos Riesgo Base
      
    
    
      
          Tarifario Vehículos Riesgo Excepcion
      
    
    
      
          Tarifario Vehículos Servicio
      
    
    
      
          Tarifario Vehículos Zona
      
    
    
      
          Tarifario Vehículos Inspección
      
    
    
      
          Tarifarios Vehículos Servicio Requiere
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Tarifario Inmuebles
        
          
        
      

      
        


    
      
          Tarifario Zona Sismica
      
    
    
      
          Tarifario Zona Inmueble
      
    
    
      
          Tarifario Zona Huracán
      
    
    
      
          Tarifario Zona Inspección
      
    
    
      
          Tarifario Riesgo Base
      
    
    
      
          Tarifario Riesgo Excepción
      
    
    
      
          Tarifario Zona Siniestralidad
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Coaseguro
        
          
        
      

      
        


    
      
          Brokers
      
    
    
      
          Compañías de Seguros
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Cobranzas
        
          
        
      

      
        


    
      
          Tipos de pago
      
    
    
      
          Formas de pago
      
    
    
      
          Calendarios débitos
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Comercial
        
          
        
      

      
        


    
      
          Tipos de agente
      
    
    
      
          Agentes
      
    
    
      
          Ejecutivo Comercial
      
    
    
      
          Tipo Comisión
      
    
    
      
          Canal
      
    
    
      
          Subcanal
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Endosos
        
          
        
      

      
        


    
      
          Causas
      
    
    
      
          Grupos
      
    
    
      
          Tipos
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Anexos y cláusulas
        
          
        
      

      
        


    
      
          Nodos
      
    
    
      
          Aplicación
      
    
    
      
          Resolución / Proveído
      
    
    
      
          Tarifario Resolución
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Impuestos
        
          
        
      

      
        


    
      
          Impuesto IIBB
      
    
    
      
          Impuesto Sellado
      
    
    
      
          Percepcion Iva
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Caución
        
          
        
      

      
        


    
      
          Avalistas
      
    
    
      
          Despachantes
      
    
    
      
          Obras
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Accidentes Personales
        
          
        
      

      
        


    
      
          Categoría de actividad
      
    
    
      
          Rangos de edad
      
    
    
      
          Parentesco
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Autos
        
          
        
      

      
        


    
      
          Accesorio
      
    
    
      
          Adicional
      
    
    
      
          Beneficio
      
    
    
      
          Combustible
      
    
    
      
          Servicio
      
    
    
      
          Clase Vehículos
      
    
    
      
          Clausula Ajuste Vehículos
      
    
    
      
          Descuento Vehículos
      
    
    
      
          Marca Vehículos
      
    
    
      
          Modelo Vehículos
      
    
    
      
          Kilometraje Vehículos
      
    
    
      
          Familias de Vehículos
      
    
    
      
          Destinos de Vehículos
      
    
    
      
          Estado Vehículos
      
    
    
      
          Grupos de Vehículos
      
    
    
      
          Prestador de Vehículos
      
    
    
      
          Regiones de Vehículos
      
    
    
      
          Tipos de Vehículos
      
    
    
      
          Zonas de Vehículos 
      
    
    
      
          Carrocería
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Interfaces
        
          
        
      

      
        


    
      
          Web API
      
    
    
      
          Web API Key
      
    
    
      
          Web API Log
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Notificacion
        
          
        
      

      
        


    
      
          Envío Notificacion
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Transporte
        
          
        
      

      
        


    
      
          Grupo de Mercaderias
      
    
    
      
          Mercaderías
      
    
    
      
          Riesgos de Transporte
      
    
    
      
          Tipos de Transporte
      
    
    
      
          Clases de Transporte
      
    
    
      
          Rutas de Transporte
      
    
    
      
          Tipo Punto Embarque
      
    
    
      
          Punto Embarque
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Certificados
        
          
        
      

      
        


    
      
          Tipos Certificados
      
    
    
      
          Certificado
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Inmuebles
        
          
        
      

      
        


    
      
          Agravante Inmueble
      
    
    
      
          Atenuante Inmueble
      
    
    
      
          Categoria Inmueble
      
    
    
      
          Zona Inmueble
      
    
    
      
          Zona Huracán
      
    
    
      
          Zona Siniestralidad
      
    
    
      
          Zona Sísmica
      
    
    
      
          Sub-límite
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
          Suscripción
        
          
        
      

      
        


    
      
          Grupo Suscripción
      
    
    
      
          Suscriptores
      
    
    
      
          Perfil Suscripción
      
    
    
      
          Área Suscripción
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
    
  
  




  function adin_modal_overlay(msg, show) {
    $('#adinModal_Overlay .title').html(msg);
    if (show)
      $('#adinModal_Overlay').modal('show');
    else
      $('#adinModal_Overlay').modal('hide');
  }

  function adin_modal_simple_success(msg, event) {
    $('#adinModalSuccess_Simple').modal();
    $('#adinModalSuccess_Simple .title').html(msg);
    if (event) {
      $('#adinModalSuccess_Simple .McloseButton').attr(&quot;onclick&quot;, event);
    }
  }
  function adin_modal_simple(msg, event) {
    $('#adinModal_Simple').modal();
    $('#adinModal_Simple .title').html(msg);
    if (event) {
      $('#adinModal_Simple .McloseButton').attr(&quot;onclick&quot;, event);
    }
  }
  function adin_modal_confirmacion(msg, yesEvent, noEvent, yesText, noText) {

    $('#adinModal_Confirmacion').modal();
    $('#adinModal_Confirmacion .title').html(msg);

    if (yesText)
      $('#adinModal_Confirmacion .MNoButton').attr(&quot;value&quot;, yesText);
    if (noText)
      $('#adinModal_Confirmacion .MYesButton').attr(&quot;onclick&quot;, noText);
    if (yesEvent)
      $('#adinModal_Confirmacion .MYesButton').attr(&quot;onclick&quot;, yesEvent);
    if (yesEvent)
      $('#adinModal_Confirmacion .MNoButton').attr(&quot;onclick&quot;, noEvent);

  }




  
    
      
        
      
      
      
    
  


  
    
      
        
      
      
        Cerrar
      
    
  


  
    
      
        
      
      
        Cerrar
      
    
  


  
    
      
        
      
      
        Sí
        No
      
    
  











  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }


  /* Shadow in hovering for selector sistema menu */
  .nav > li > a:hover,
  .nav > li > a:active,
  .nav > li > a:focus {
    background: rgba(131,156,167,0.4) !important;
    color: white !important;
  }

  #selectorSistema > .user-header {
    padding: 15px;
    border-bottom: 1px solid #f4f4f4;
    border-top: 1px solid #dddddd;
    height: auto;
    color: white !important;
  }

    #selectorSistema > .user-header:hover {
      box-shadow: 3px 0 8px rgba(0, 0, 1, 0.125) !important;
      background: rgba(131,156,167,0.4) !important;
      color: black !important;
    }

  /* style for keeping user profile dropdown open */
  .stay-open {
    display: block !important;
  }

  .icon-perfil-usuario {
    font-size: initial !important;
    min-width: 20px !important;
  }
  .icon-perfil-usuario-small {
    min-width: 20px !important;
    font-size: .55em !important;
  }

  /* Fix look dropdown buttons */
  .navbar-nav > .user-menu > .dropdown-menu > .user-footer .btn-default {
    color: #666666 !important;
  }


      

      
      
        
        
          
            
              
                
                  
                  
                    
                      Toggle navigation
                      
                      
                      
                    
                    
                      
                        
    
  


                         Alta de propuesta de Póliza Nueva - Autos 
                        
    

                      
                      
                    
                  

                  
                  
                    
                      

    
        
    



    
        
            Grabar
        



    
        
            Eliminar
        


    
    
       Volver
    


  
     Info
  

      
        
          
            Guardar
          
        
        
          
        
      
      
          
            
                En espera
            
          
          
            
                Aceptar
            
          
          
            
                Emitida
            
          
          
            
                Anular
            
          
          
            
                Rechazar
            
          
      
      
        function closePopoverExport() {
          $('#lnkGuardarAcciones').click();
        }

        $(document).ready(function () {
          $(&quot;#lnkGuardarAcciones&quot;).popover({
            sanitize: false,
            html: true,
            content: function () {
              return $(&quot;#divGuardarPropuestaContent&quot;).html();
            }
          });

          $('#lnkGuardarAcciones').on('shown.bs.popover', function () {
            $('[data-toggle=&quot;tooltip&quot;]').tooltip();
          });

          $('#lnkGuardarAcciones').on('hide.bs.popover', function () {
          });
        });
      
    

                    
                  
                
              

            

            
              
            
            
              ×
              
              
            

            
    


            
              
                
                Campo/s clave
                
                   Limpiar
                
              
              
                
    

              
            

            
    

    
      
        
          
          Información del movimiento
        
      
      
        
          Movimiento
          3435689
        

        
          Empresa
          Meridional Seguros
        

        
          Ramo
          Autos
        

          
            Subramo
            Autos Individual
          

        
          Tipo de emisión
          Manual
        

        
          Proceso de negocio
          Póliza Nueva
        

                                                                                  
            Fecha del movimiento
            12/08/2021 14:27
          
                  
            Usuario del movimiento
            admin
          
                      
    
  


            
              
                

















  
  
  








  
  
  
  
  
  
  
  
  
  
  
  
  

  
  

  
  
  
  

  


  
    
      
      
        
            
              
              Propuesta
            
            
              
              Personas
            
            
              
              Fechas
            
            
              
              Validaciones
            
            
              
              Adjuntos
            
            
              
              Vista previa
            
        
      
      
    

    

      




  




  .k-tabstrip ul li.k-item {
    width: 47%;
    cursor: pointer;
  }




  
    $(document).ready(function () { InitVistaPersona() });
  
  
    
      
        
            
            Personas
        
      
      
        Estado: Propuesta incompleta
      
    
  
  
      
        
          
            
                
                  
                
                
                  
                
            
          
        
      
      
          
            Copiar desde:
          
          
            Seleccionekendo.syncReady(function(){jQuery(&quot;#RolPersonaOrigenId&quot;).kendoDropDownList({&quot;change&quot;:EnableCopiarPersona,&quot;dataBound&quot;:EnableCopiarPersona,&quot;autoBind&quot;:true,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;0&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetRolesPersonaCopia&quot;,&quot;data&quot;:filterRolActual},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
              
            
            
              
            
          
      
  
  
      



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
      rolPersonaId: $(&quot;#hdnRolPersonaId_&quot; + 3).val(),
      tipoDocumentoId: $(&quot;#TipoDocumentoId_XmlValue&quot;).data(&quot;kendoDropDownList&quot;) ? $(&quot;#TipoDocumentoId_XmlValue&quot;).data(&quot;kendoDropDownList&quot;).value() : $(&quot;#TipoDocumentoId_IntValue&quot;).val(),
      numeroDocumento: $(&quot;#NumeroDocumento_StringValue&quot;).val() ? $(&quot;#NumeroDocumento_StringValue&quot;).val() : $(&quot;#lblNumeroDocumento_&quot; + 3).text(),
      tipoPersonaId: $(&quot;#TipoPersonaId_XmlValue&quot;).data(&quot;kendoDropDownList&quot;) ? $(&quot;#TipoPersonaId_XmlValue&quot;).data(&quot;kendoDropDownList&quot;).value() : $(&quot;#TipoPersonaId_IntValue&quot;).val(),
      sexoId: $(&quot;#SexoId_XmlValue&quot;).data(&quot;kendoDropDownList&quot;) ? $(&quot;#SexoId_XmlValue&quot;).data(&quot;kendoDropDownList&quot;).value() : $(&quot;#SexoId_IntValue&quot;).val(),
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

    SelectTextForEdit(e);
  }




  
    $(document).ready(function() {
      //chequeo divs por razon social
      ChequearRazonSocial(3, 2);
    });
  



  
    

    
    
  
  
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Tipo de documento
  Documento Nacional de Identidad [6]kendo.syncReady(function(){jQuery(&quot;#TipoDocumentoId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoDocumento,&quot;dataBound&quot;:SetTipoPersonaDefault,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;2&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposDocumento&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#TipoDocumentoId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


    
  
Número de documento
      


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Tipo de persona
  Persona física [1]kendo.syncReady(function(){jQuery(&quot;#TipoPersonaId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoPersona,&quot;dataBound&quot;:SetTipoPersona,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;2&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposPersona&quot;,&quot;data&quot;:filterTipoDocumento},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
    
  

  
    
  
Apellido
      

    
  
Nombre
      


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Personería jurídica
  Seleccionekendo.syncReady(function(){jQuery(&quot;#PersoneriaJuridicaId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateCampoPersona,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetPersoneriasJuridicas&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#PersoneriaJuridicaId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
    
  

  
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Nacionalidad
  Seleccionekendo.syncReady(function(){jQuery(&quot;#NacionalidadId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateCampoPersona,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetNacionalidades&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#NacionalidadId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


    
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }


  
Grupo económico
    kendo.syncReady(function(){jQuery(&quot;#GrupoEconomicoId_XmlValue&quot;).kendoComboBox({&quot;change&quot;:UpdateGrupoEconomico,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;autoBind&quot;:true,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetGruposEconomicos&quot;,&quot;data&quot;:filterGrupoEconomico},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});  


    
  
Fecha de nacimiento
    kendo.syncReady(function(){jQuery(&quot;#FechaNacimiento_DateTimeValue&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;max&quot;:new Date(9999,11,31,23,59,59,999)});});  


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Sexo
  Seleccionekendo.syncReady(function(){jQuery(&quot;#SexoId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateCampoPersona,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetSexo&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#SexoId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Estado Civil
  Seleccionekendo.syncReady(function(){jQuery(&quot;#EstadoCivilId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateCampoPersona,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetEstadosCiviles&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#EstadoCivilId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});

  

  
    
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }


  
Actividad / Ocupación
    kendo.syncReady(function(){jQuery(&quot;#OcupacionId_XmlValue&quot;).kendoComboBox({&quot;change&quot;:UpdateOcupacion,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;autoBind&quot;:true,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetOcupaciones&quot;,&quot;data&quot;:filterOcupacion},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});  

  

  
    
  
Observaciones
      


    
  
Persona expuesta políticamente
      

  



  
  
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Domicilio
  Seleccionekendo.syncReady(function(){jQuery(&quot;#PersonaDomicilioId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:SeleccionarPersonaDomicilio,&quot;dataBound&quot;:SetPersonaDomicilio,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;value&quot;:&quot;0&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetDomiciliosPersona&quot;,&quot;data&quot;:filterPersonaDomicilio},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
    
  
  
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Tipo dom.
  Seleccionekendo.syncReady(function(){jQuery(&quot;#TipoDomicilioId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateTipoDomicilio,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposDomicilio&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#TipoDomicilioId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




País
  Seleccionekendo.syncReady(function(){jQuery(&quot;#PaisId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdatePais,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetPaises&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#PaisId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Provincia
  Seleccionekendo.syncReady(function(){jQuery(&quot;#ProvinciaId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateProvincia,&quot;dataBound&quot;:ChequearEnabledPaisProvincia,&quot;cascadeFrom&quot;:&quot;PaisId_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetProvincias&quot;,&quot;data&quot;:filterProvincia},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});

  
  
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }


  
Localidad
    kendo.syncReady(function(){jQuery(&quot;#LocalidadId_XmlValue&quot;).kendoComboBox({&quot;change&quot;:UpdateLocalidad,&quot;dataBound&quot;:ChequearEnabledPaisLocalidad,&quot;autoBind&quot;:true,&quot;cascadeFrom&quot;:&quot;ProvinciaId_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la búsqueda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetLocalidades&quot;,&quot;data&quot;:filterLocalidad},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});  


    
C. P.
      kendo.syncReady(function(){jQuery(&quot;#CodigoPostal&quot;).kendoComboBox({&quot;change&quot;:UpdateCampoPersona,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetCodigosPostales&quot;,&quot;data&quot;:filterCodigoPostal},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});    

    
  
Número sucursal
      

  
  
    
  
Calle
      


    
  
Número
      


    
  
Piso
      


    
  
Dpto.
      

  

  
  
    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Condición de IVA
  Seleccionekendo.syncReady(function(){jQuery(&quot;#CondicionIvaId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateCampoPersona,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetCondicionesIva&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#CondicionIvaId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});


    

  function DefaultCampoEmisionEvent(e) {
    e.preventDefault();
  }




Condición de IIBB
  Seleccionekendo.syncReady(function(){jQuery(&quot;#CondicionIIBBId_XmlValue&quot;).kendoDropDownList({&quot;change&quot;:UpdateCampoPersona,&quot;dataBound&quot;:DefaultCampoEmisionEvent,&quot;cascadeFrom&quot;:&quot;_XmlValue&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetCondicionesIIBB&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#CondicionIIBBId_XmlValue&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});

  



    
    
      
        Contactos
      
    
    
      
         Nuevo ContactoTipoTipo Contacto NombreValorkendo.syncReady(function(){jQuery(&quot;#grdContactos_3&quot;).kendoGrid({&quot;save&quot;:ActualizarContacto,&quot;edit&quot;:ValidarValorTipoContacto,&quot;navigatable&quot;:true,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003e\u003c/span\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap; text-align:center;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Eliminar\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-times\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Eliminar&quot;,&quot;click&quot;:QuitarContacto}]},{&quot;title&quot;:&quot;Tipo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;,&quot;onchange&quot;:&quot;SetTipoContactoNombre(this)&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;300px&quot;,&quot;field&quot;:&quot;TipoContactoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-required=\&quot;The TipoContactoId field is required.\&quot; id=\&quot;TipoContactoId\&quot; name=\&quot;TipoContactoId\&quot; style=\&quot;width:100%; min-width:300px;\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoContactoId\&quot;).kendoDropDownList({\&quot;dataTextField\&quot;:\&quot;Descripcion\&quot;,\&quot;dataValueField\&quot;:\&quot;Id\&quot;,\&quot;optionLabel\&quot;:\&quot;Seleccione\&quot;,\&quot;dataSource\&quot;:{\&quot;transport\&quot;:{\&quot;read\&quot;:{\&quot;url\&quot;:\&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposContactoByTipoPersona\&quot;,\&quot;data\&quot;:filterTipoPersona},\&quot;prefix\&quot;:\&quot;\&quot;},\&quot;serverFiltering\&quot;:true,\&quot;filter\&quot;:[],\&quot;schema\&quot;:{\&quot;errors\&quot;:\&quot;Errors\&quot;}}});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoContactoId\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;,&quot;values&quot;:[{&quot;text&quot;:&quot;Dirección de sede social&quot;,&quot;value&quot;:&quot;5&quot;},{&quot;text&quot;:&quot;Email&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;text&quot;:&quot;Email alertas Siniestros asignados&quot;,&quot;value&quot;:&quot;30&quot;},{&quot;text&quot;:&quot;Email póliza electrónica&quot;,&quot;value&quot;:&quot;4&quot;},{&quot;text&quot;:&quot;Fax&quot;,&quot;value&quot;:&quot;8&quot;},{&quot;text&quot;:&quot;Sitio web&quot;,&quot;value&quot;:&quot;3&quot;},{&quot;text&quot;:&quot;Teléfono celular&quot;,&quot;value&quot;:&quot;7&quot;},{&quot;text&quot;:&quot;Teléfono de sede social&quot;,&quot;value&quot;:&quot;6&quot;},{&quot;text&quot;:&quot;Teléfono fijo&quot;,&quot;value&quot;:&quot;2&quot;},{&quot;text&quot;:&quot;tipo contacto&quot;,&quot;value&quot;:&quot;29&quot;}]},{&quot;title&quot;:&quot;Tipo Contacto Nombre&quot;,&quot;hidden&quot;:true,&quot;field&quot;:&quot;TipoContactoNombre&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput id=\&quot;TipoContactoNombre\&quot; name=\&quot;TipoContactoNombre\&quot; style=\&quot;width:100%;\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoContactoNombre\&quot;).kendoTextBox({});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoContactoNombre\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Valor&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;500px&quot;,&quot;field&quot;:&quot;Valor&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput id=\&quot;Valor\&quot; name=\&quot;Valor\&quot; style=\&quot;width:100%;\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#Valor\&quot;).kendoTextBox({});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;Valor\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;}],&quot;scrollable&quot;:false,&quot;editable&quot;:{&quot;confirmation&quot;:false,&quot;confirmDelete&quot;:&quot;¿Desea eliminar este registro?&quot;,&quot;cancelDelete&quot;:&quot;Cancel&quot;,&quot;mode&quot;:&quot;incell&quot;,&quot;create&quot;:true,&quot;update&quot;:true,&quot;destroy&quot;:true,&quot;template&quot;:null},&quot;toolbar&quot;:&quot;\u003cbutton type=\u0027button\u0027 class=\u0027k-button\u0027 onclick=\u0027AgregarContacto()\u0027 title=\u0027Nuevo Contacto\u0027\u003e\u003cspan\u003e\u003ci class=\u0027fa fa-file\u0027\u003e\u003c/i\u003e\u0026nbsp;Nuevo\u0026nbsp;Contacto\u003c/span\u003e\u003c/button\u003e\u003c/div\u003e&quot;,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/CampoEmision/grdPersonaContactos_Read&quot;,&quot;data&quot;:filterPersonaContactos},&quot;prefix&quot;:&quot;&quot;},&quot;error&quot;:grd_ErrorHandler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;TipoContactoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoContactoNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Valor&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});
      
    






  

    
      
        ×
        Selección de persona
      

      

        
          
            IdDocumentoSexoNombreFecha Nac.No se encontraron registros con el criterio de búsqueda ingresado.0No hay registros.kendo.syncReady(function(){jQuery(&quot;#grdSeleccion&quot;).kendoGrid({&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan class=\u0027no-records-text\u0027\u003eNo se encontraron registros con el criterio de búsqueda ingresado.\u003cspan\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Seleccionar\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-check-circle\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Seleccionar&quot;,&quot;click&quot;:SeleccionarPersona}]},{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: right;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Id&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Documento&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot;#= armarListaDocumentos(PersonaDocumentos) #&quot;,&quot;field&quot;:&quot;PersonaDocumentos&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Sexo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot; #= Sexo ? Sexo.Descripcion : \u0027Sin Especificar\u0027 # &quot;,&quot;field&quot;:&quot;Sexo.Descripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Nombre&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align:left;&quot;},&quot;template&quot;:&quot;\u003ctext\u003e#= GetDescripcionPersona(data) #\u003c/text\u003e&quot;},{&quot;title&quot;:&quot;Fecha Nac.&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;field&quot;:&quot;FechaNacimiento&quot;,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;buttonCount&quot;:10},&quot;scrollable&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/CampoEmision/grdSeleccionPersona_Read?tipoDocumentoId=2&quot;,&quot;data&quot;:getViewModel},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:5,&quot;page&quot;:1,&quot;groupPaging&quot;:false,&quot;total&quot;:0,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;Id&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EmpresaId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Empresa&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;TipoPersonaId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoPersona&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;ApellidoRazonSocial&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Nombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NacionalidadId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Nacionalidad&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;SexoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Sexo&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersoneriaJuridicaId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PersoneriaJuridica&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;FechaNacimiento&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;EstadoCivilId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;EstadoCivil&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;OcupacionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Ocupacion&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;CondicionIvaId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CondicionIva&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;GrupoEconomicoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;GrupoEconomico&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;GrupoAdjuntoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;GrupoAdjunto&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;Observaciones&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PersonaExpuestaPoliticamente&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;CodigoExterno&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PersonaDomicilios&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaContactos&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaCondicionIIBB&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaRelaciones&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonasRelacionadas&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaDocumentos&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;PersonaExclusionImpuestos&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;ClearListDomicilios&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListContactos&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListRelacionadas&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListIIBB&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ClearListExclusionImpuesto&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;UsuarioInsert&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FechaInsert&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;UsuarioUpdate&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FechaUpdate&quot;:{&quot;type&quot;:&quot;date&quot;}}}}}});});
          
        
      
      
      
    
  




  


      
        
          
          
          
          
          
          
        
      

    
  



  
  
    

      
        
          ×
          Validaciones
        

        

          
            
              IdItem IdValidacion Id MensajeItems afectadosNo hay registroskendo.syncReady(function(){jQuery(&quot;#grdModalValidaciones&quot;).kendoGrid({&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003eNo hay registros\u003c/span\u003e&quot;},&quot;columns&quot;:[{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Id&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Item Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ItemId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Validacion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;ValidacionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot; &quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;width&quot;:&quot;40px&quot;,&quot;template&quot;:&quot;\u003cimg src=\u0027/AdInsurance/Emision/assets/icons/validaciones/#=Icono #\u0027 alt=\u0027#=TipoValidacionNombre #\u0027 Title=\u0027#=TipoValidacionNombre #\u0027/\u003e&quot;,&quot;field&quot;:&quot;Icono&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Mensaje&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot;\u003cspan title=\u0027ID: #=ValidacionId #\nNombre: #=ValidacionNombre #\nDescripción: #=Descripcion #\nTipo: #=TipoValidacionNombre ##=HideIfNull(\&quot;\\nSuscriptores: \&quot;,\&quot;\&quot;,ValidacionSuscriptores) ##=HideIfNull(\&quot;\\nDatos: \&quot;,\&quot;\&quot;,Datos) #\nEstado: #=EstadoValidacionDescripcion #\u0027\u003e#=Mensaje #\u003c/span\u003e&quot;,&quot;field&quot;:&quot;Mensaje&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Items afectados&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;width&quot;:&quot;40px&quot;,&quot;field&quot;:&quot;ItemsAfectados&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true}],&quot;scrollable&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;sort&quot;:[{&quot;field&quot;:&quot;ValidacionNombre&quot;,&quot;dir&quot;:&quot;asc&quot;}],&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;MovimientoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;ModoPreview&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;SolapaTitulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SolapaIcono&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Id&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ItemId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ValidacionId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;},&quot;ValidacionNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Mensaje&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;TipoValidacionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoValidacionNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Icono&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;EstadoValidacionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EstadoValidacionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Ignorar&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;AplicaPorItem&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Datos&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Items&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ItemsAfectados&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;GrupoSuscripcionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GrupoSuscripcionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ValidacionSuscriptores&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ValorReferencia&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AccionNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Aprobada&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Rechazada&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Escalada&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;EsUsuarioSuscriptor&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Bitacora&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Bitacora_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Bitacora_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EquipoDistribucionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;EquipoDistribucionId_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EquipoDistribucionId_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EquipoDistribucionId_Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionId_Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;}}}}}});});
            
          
        
        
          Cerrar
        
      
    
  


  
  
    
      
        
          ×
          Indique motivo
        

        

          
            
          

          
            
              
                Motivo 
                Seleccionekendo.syncReady(function(){jQuery(&quot;#cboEstadoCotizacionMotivo&quot;).kendoDropDownList({&quot;change&quot;:cboEstadoCotizacionMotivo_change,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetMotivosCotizacionRechazo&quot;,&quot;data&quot;:filterByMovimiento},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
            
            
              
                Mails a notificar (opcional)
                kendo.syncReady(function(){jQuery(&quot;#txtMailNotificacion&quot;).kendoTextBox({});});
              
            
            
              
                Observaciones a incluir en la notificación (opcional)
                
              
            
          
        
        
          Aceptar
        
      
    
  

  







                
              
            

            
    

    
        
            
                
                    
                        
                    
                
                
                    
                        
    



    
        
            Grabar
        



    
        
            Eliminar
        

                        
                    
                
            
        
    

          
        
        
      
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;k-webkit k-webkit92&quot;]/body[@class=&quot;skin-green custom-skin sidebar-collapse sidebar-mini&quot;]/form[1]/div[@class=&quot;wrapper&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
