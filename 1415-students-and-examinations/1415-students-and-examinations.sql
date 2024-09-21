# Write your MySQL query statement below
SELECT 
st.student_id, 
st.student_name, 
s.subject_name,
COUNT(e.student_id) AS attended_exams
FROM Students st 
CROSS JOIN Subjects s
LEFT JOIN Examinations e ON e.student_id = st.student_id
AND e.subject_name = s.subject_name
GROUP BY st.student_id, s.subject_name
ORDER BY st.student_id ASC, s.subject_name ASC;