$(document).ready(function() {
  // banner slider 
  var owl = $('#BannerSlider').owlCarousel({
    loop: true,
    margin: 0,
    items: 1,
    dots: true,
    autoHeight: true,
    autoplay: true
  });
  // sticky header
  $(window).scroll(function() {
    if ($(this).scrollTop() > 1) {
      $('body').addClass("sticky");
    } else {
      $('body').removeClass("sticky");
    }
  });
  // smooth scroll
  $(".smooth-scroll").click(function() {
    var target = $(this).attr("href"),
      scrollTo = $(target).offset().top,
      headerHeight = $('#Header').outerHeight();
    console.log(headerHeight);
    $('html, body').animate({ scrollTop: scrollTo - headerHeight });
    $('#nav-icon1').trigger("click");
    $("body").removeClass("menu-active");
  });
  //menu icon animation
  $('#nav-icon1').click(function() {
    $(this).toggleClass('open');
    $("body").toggleClass("menu-active");
  });
  //menu link click
  // magnific video popup  
  $('.popup-youtube-wst').magnificPopup({
    type: 'iframe',
    mainClass: 'mfp-fade',
    removalDelay: 160,
    preloader: false,
    fixedContentPos: false,
  });
  // contact form script
  $('.form-wrap input, .form-wrap textarea, .email-box input').blur(function() {
    tmpval = $(this).val();
    if (tmpval == '') {
      $(this).addClass('empty');
      $(this).removeClass('not-empty');
    } else {
      $(this).addClass('not-empty');
      $(this).removeClass('empty');
    }
  });
  // Our Work filter
  $('#OurWork .filter-list ul li').click(function() {
    dis = $(this),
      disFilter = dis.data("filter");
    finalFilter = disFilter == "all" ? "*" : "." + disFilter;
    dis.addClass('active').siblings().removeClass('active');
    $("#OurWork .filter-box .each-box").hide().filter(finalFilter).show();
  });
});