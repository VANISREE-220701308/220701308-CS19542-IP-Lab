document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();
    validateForm();
});

function validateForm() {
    let valid = true;

    // Clear previous error messages
    document.querySelectorAll('.error').forEach(function(element) {
        element.textContent = '';
    });

    // Student Name validation
    const studentName = document.getElementById('student_name').value.trim();
    if (studentName === '') {
        document.getElementById('nameError').textContent = 'Student Name is required';
        valid = false;
    }

    // Roll Number validation
    const rollno = document.getElementById('rollno').value.trim();
    if (rollno === '') {
        document.getElementById('rollnoError').textContent = 'Roll Number is required';
        valid = false;
    } else if (!/^[0-9]+$/.test(rollno)) {
        document.getElementById('rollnoError').textContent = 'Roll Number should contain only numbers';
        valid = false;
    }

    // Gender validation
    const gender = document.querySelector('input[name="gender"]:checked');
    if (!gender) {
        document.getElementById('genderError').textContent = 'Gender is required';
        valid = false;
    }

    // Year validation
    const year = document.getElementById('year').value.trim();
    if (year === '') {
        document.getElementById('yearError').textContent = 'Year is required';
        valid = false;
    }

    // Department validation
    const department = document.getElementById('department').value.trim();
    if (department === '') {
        document.getElementById('departmentError').textContent = 'Department is required';
        valid = false;
    }

    // Section validation
    const section = document.getElementById('section').value.trim();
    if (section === '') {
        document.getElementById('sectionError').textContent = 'Section is required';
        valid = false;
    }

    // Mobile Number validation
    const mobileNo = document.getElementById('mobile_no').value.trim();
    if (mobileNo === '') {
        document.getElementById('mobileNoError').textContent = 'Mobile Number is required';
        valid = false;
    } else if (!/^\d{10}$/.test(mobileNo)) {
        document.getElementById('mobileNoError').textContent = 'Mobile Number should be 10 digits';
        valid = false;
    }

    // Email validation
    const email = document.getElementById('email').value.trim();
    if (email === '') {
        document.getElementById('emailError').textContent = 'E-Mail ID is required';
        valid = false;
    } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        document.getElementById('emailError').textContent = 'Invalid E-Mail ID format';
        valid = false;
    }

    // Course validation
    const course = document.getElementById('course').value.trim();
    if (course === '') {
        document.getElementById('courseError').textContent = 'Course is required';
        valid = false;
    }

    // Subject code validation
    const subjectcode = document.getElementById('subjectcode').value.trim();
    if (subjectcode === '') {
        document.getElementById('subjectcodeError').textContent = 'Subject code is required';
        valid = false;
    } else if (!/^[A-Za-z]{2}\d{5}$/.test(subjectcode)) {
        document.getElementById('subjectcodeError').textContent = 'Subject code should start with two letters followed by five digits';
        valid = false;
    }

    // Credit validation
    const credit = document.getElementById('credit').value.trim();
    if (credit === '') {
        document.getElementById('creditError').textContent = 'Credit is required';
        valid = false;
    }

    // Pincode validation
    const pincode = document.getElementById('pincode').value.trim();
    if (pincode === '') {
        document.getElementById('pincodeError').textContent = 'Pincode is required';
        valid = false;
    } else if (!/^\d{6}$/.test(pincode)) {
        document.getElementById('pincodeError').textContent = 'Pincode should be 6 digits';
        valid = false;
    }

    // If all validations pass, the form can be submitted
    if (valid) {
        alert('Form submitted successfully!');
        document.getElementById('registrationForm').submit();
    }
}
