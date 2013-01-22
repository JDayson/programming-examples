Public Class About
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub btnAddIngredient_Click(sender As Object, e As EventArgs) Handles btnAddIngredient.Click
        'this sub needs to add an ingredient including the fractional component, unit of measurement and name of ingredient
    End Sub

    Protected Sub btnUploadRecipe_Click(sender As Object, e As EventArgs) Handles btnUploadRecipe.Click
        'this button needs to be able to send a recipe to the database, it will need to add all ingredients to the recipe, it will
        'need to assign a recipe ID and add instructions to the appropriate points in the database
    End Sub
End Class