$(function() {
    // This function gets cookie with a given name
    function getCookie(name) {
        var cookieValue = null;
        if (document.cookie && document.cookie != '') {
            var cookies = document.cookie.split(';');
            for (var i = 0; i < cookies.length; i++) {
                var cookie = jQuery.trim(cookies[i]);
                // Does this cookie string begin with the name we want?
                if (cookie.substring(0, name.length + 1) == (name + '=')) {
                    cookieValue = decodeURIComponent(cookie.substring(name.length + 1));
                    break;
                }
            }
        }
        return cookieValue;
    }
    var csrftoken = getCookie('csrftoken');

    /*
    The functions below will create a header with csrftoken
    */
    function csrfSafeMethod(method) {
        // these HTTP methods do not require CSRF protection
        return (/^(GET|HEAD|OPTIONS|TRACE)$/.test(method));
    }
    function sameOrigin(url) {
        // test that a given url is a same-origin URL
        // url could be relative or scheme relative or absolute
        var host = document.location.host; // host + port
        var protocol = document.location.protocol;
        var sr_origin = '//' + host;
        var origin = protocol + sr_origin;
        // Allow absolute or scheme relative URLs to same origin
        return (url == origin || url.slice(0, origin.length + 1) == origin + '/') ||
            (url == sr_origin || url.slice(0, sr_origin.length + 1) == sr_origin + '/') ||
            // or any other URL that isn't scheme relative or absolute i.e relative.
            !(/^(\/\/|http:|https:).*/.test(url));
    }

    $.ajaxSetup({
        beforeSend: function(xhr, settings) {
            if (!csrfSafeMethod(settings.type) && sameOrigin(settings.url)) {
                // Send the token to same-origin, relative URLs only.
                // Send the token only if the method warrants CSRF protection
                // Using the CSRFToken value acquired earlier
                xhr.setRequestHeader("X-CSRFToken", csrftoken);
            }
        }
    });
});



var show = 0;

Mousetrap.bind('?', 
    function() { 
        if(!show){
            $('#shortcutModal').modal(); 
            show = 1;
        }else{
            $('#shortcutModal').modal('hide'); 
            show = 0;

        }
    }
);

first = jQuery('.iterable-item').first()
last = jQuery('.iterable-item').last();
actual = false
previous = false

function iterate_next(){
    if(!actual){
        actual = first
        actual.addClass('success');
    }else{
        previous = actual
        actual = actual.next()
        if(actual.index() == -1){
            actual = first;
        }
        actual.addClass('success');
        previous.removeClass('success')
    }
}

function iterate_previous(){
    if(!actual){
        last = jQuery('.iterable-item').last();
        actual = last
        actual.addClass('focused');
    }else{
        previous = actual
        actual = actual.prev()
        if(actual.index() == -1){
            actual = last;
        }
        actual.addClass('success');
        previous.removeClass('success')

    }
}

Mousetrap.bind('g p', function() { window.location.assign("/problems") })
Mousetrap.bind('g t', function() { window.location.assign("/tutorials") })
Mousetrap.bind('g c', function() { window.location.assign("/contests") })
Mousetrap.bind('g u', function() { window.location.assign("/users") })
Mousetrap.bind('g s', function() { window.location.assign("/submissions") })

Mousetrap.bind('g x p', function() { window.location.assign("/user/settings/profile") })
Mousetrap.bind('g x a', function() { window.location.assign("/user/settings/account") })
Mousetrap.bind('g x e', function() { window.location.assign("/user/settings/email") })
Mousetrap.bind('g x s', function() { window.location.assign("/user/settings/password") })
Mousetrap.bind('g x t', function() { window.location.assign("/user/settings/team") })

Mousetrap.bind('g e', function() { window.location.assign("/statistics") })
Mousetrap.bind('g a', function() { window.location.assign("/user/settings/team") })
Mousetrap.bind('g h', function() { window.location.assign("/") })
Mousetrap.bind('u', function() { history.back(-1) })

Mousetrap.bind('k', function() {
    iterate_next();
})

Mousetrap.bind('j', function() {
    iterate_previous();
})

Mousetrap.bind('o', function() {
    window.location.assign(actual.find('a').first().attr('href'));
})
