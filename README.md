# Notebook API

*API provides CRUD for notes*

### Steps to run

1. Clone the project with
   `git clone https://github.com/katerina20/notebook-app.git`
2. Go to the cloned project and build it with `gradlew build`
3. Up it with `docker-compose up`
4. `docker-compose down` stops the service.

### Endpoints:


#### Get all notes ordered by creation time

<details>
<summary><code>GET</code>
<code><b>/api/notes</b></code>
</summary>

##### Response body

```json
[
   {
      "id": "<note_id>",
      "content": "<content_text>",
      "likes": 0,
      "createdAt": "<date>"
   },
   {
      "id": "<note_id>",
      "content": "<content_text>",
      "likes": 0,
      "createdAt": "<date>"
   }
]
```
</details>

#### Creating new note

<details>
<summary><code>POST</code> <code><b>/api/notes</b></code></summary>

##### Request body
```json
{
   "content": "<content_text>"
}
```

##### Response body

```json
{
   "id": "<note_id>",
   "content": "<content_text>",
   "likes": 0,
   "createdAt": "<date>"
}
```
</details>

#### Update note content

<details>
<summary><code>POST</code> <code><b>/api/notes/&lt;id&gt;</b></code></summary>

##### Request body
```json
{
   "id": "<note_id>",
   "content": "<content_text>"
}
```

##### Response body

```json
{
   "id": "<note_id>",
   "content": "<content_text>",
   "likes": 0,
   "createdAt": "<date>"
}
```
</details>

#### Delete note

<summary><code>DELETE</code> <code><b>/api/notes/&lt;id&gt;</b></code></summary>

#### Like note

<details>
<summary><code>DELETE</code> <code><b>/api/notes/&lt;id&gt;/like</b></code></summary>

Need Basic Auth

</details>

#### Unlike note

<details>
<summary><code>DELETE</code> <code><b>/api/notes/&lt;id&gt;/unlike</b></code></summary>

Need Basic Auth

</details>

Credentials to use for Basic Auth:
```text
username: user
password: password
```

For the implementation Spring Boot is used. MongoDb is used as a database.