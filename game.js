$(document).ready(function() {
    var width = screen.width - 50;
    var height = screen.height - 50;
    var keyPressCount = 0; // Counter to keep track of key presses

    // Display the key press count
    function updateKeyPressCount() {
        $('#keyPressCount').text('Key Press Count: ' + keyPressCount);
    }

    // Function to generate random color
    function getRandomColor() {
        var letters = '0123456789ABCDEF';
        var color = '#';
        for (var i = 0; i < 6; i++) {
            color += letters[Math.floor(Math.random() * 16)];
        }
        return color;
    }

    // Function to generate random letter between A-Z
    function getRandomLetter() {
        var randomCode = Math.floor(Math.random() * (90 - 65 + 1)) + 65; // Between 65 and 90
        return String.fromCharCode(randomCode);
    }

    // Function to create a new bubble
    function createBubble() {
        var letter = getRandomLetter();
        var randomX = Math.floor(Math.random() * width);
        var randomY = Math.floor(Math.random() * height);
        var color = getRandomColor();

        var bubble = $('<div class="bubble">' + letter + '</div>').css({
            top: randomY + 'px',
            left: randomX + 'px',
            backgroundColor: color
        });

        $('body').append(bubble);

        setTimeout(function() {
            bubble.fadeOut(500, function() {
                $(this).remove();
            });
        }, 2000); // Remove bubble after 3 seconds
    }

    // Call createBubble every 2 seconds
    setInterval(createBubble, 2000);

    // Detect keypress and remove corresponding bubble
    $(document).keypress(function(event) {
        keyPressCount++; // Increment key press count
        updateKeyPressCount(); // Update the displayed count

        var pressedKey = String.fromCharCode(event.which).toUpperCase();
        $('.bubble').each(function() {
            if ($(this).text() === pressedKey) {
                $(this).remove(); // Remove the bubble if key matches
            }
        });
    });

    // Add the counter display to the page
    $('body').append('<div id="keyPressCount" style="position: fixed; top: 10px; right: 10px; font-size: 20px;">Key Press Count: 0</div>');
});
/**
 * 
 */