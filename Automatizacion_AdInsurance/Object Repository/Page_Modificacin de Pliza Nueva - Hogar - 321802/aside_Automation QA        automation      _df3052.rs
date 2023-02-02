<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>aside_Automation QA        automation      _df3052</name>
   <tag></tag>
   <elementGuidId>fc017cca-7b0d-45f9-ae8c-4c77f5391461</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>aside.main-sidebar</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Ingreso anterior: 06/09/2022 14:20:53'])[1]/following::aside[1]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>aside</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>main-sidebar</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  
  
    
    
      
        
      
      
        Automation QA
        automation
      
    

    
    
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
      
    
    
      
          Vida Obligatorio
        
          
        
      

      
        


    
      
          AFIP Lote Vida Obligatorio
      
    
    
      
          Consulta AFIP por lote
      
    
    
      
          Consulta AFIP por contribuyente
      
    
    
      
          SSN Lote Kausay
      
    


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
        
      
    
    
      
          Consulta de marcas de gestión
      
    
    
      
          Consulta de Siniestros
      
    


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
      
    
    
      
          Marcas de Gestión
      
    


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
        
      
    
    
      
          Prima Mínima
      
    


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
      
    
    
      
          Percepcion Iva Exclusion
      
    


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
    
  
  
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;k-webkit k-webkit104&quot;]/body[@class=&quot;skin-green custom-skin sidebar-collapse sidebar-mini&quot;]/form[1]/div[@class=&quot;wrapper&quot;]/aside[@class=&quot;main-sidebar&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Ingreso anterior: 06/09/2022 14:20:53'])[1]/following::aside[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//aside</value>
   </webElementXpaths>
</WebElementEntity>
